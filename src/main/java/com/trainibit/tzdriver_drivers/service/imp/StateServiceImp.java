package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.entity.State;
import com.trainibit.tzdriver_drivers.mapper.StateMapper;
import com.trainibit.tzdriver_drivers.repository.StateRepository;
import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import com.trainibit.tzdriver_drivers.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@ComponentScan
@Service
public class StateServiceImp implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private @Qualifier("stateMapperImpl") StateMapper stateMapper;

    @Override
    public List<StateResponse> findAll() {
        if (stateRepository.findByActiveTrue().isEmpty()) {
            throw new NoSuchElementException("Error, No se encontraron estados (states) con active=true");
        }else{
            return stateMapper.mapListEntityToListResponse(stateRepository.findByActiveTrue()) ;
        }
    }

    @Override
    public StateResponse findById(UUID uuid) {
        return stateMapper.mapEntityToResponse(stateRepository.findByUuidAndActiveTrue(uuid).orElseThrow(() -> new NoSuchElementException("Error al buscar estado (state) con ID: " + uuid){}));

    }

    @Override
    public StateResponse postState(StateRequest stateRequest) {
        State state = stateMapper.mapRequestToEntity(stateRequest);
        state.setUuid(UUID.randomUUID());
        State stateSaved = stateRepository.save(state);
        return stateMapper.mapEntityToResponse(stateSaved);
    }

    @Override
    public StateResponse putById(UUID uuid, StateRequest stateRequest) {
        return stateRepository.findByUuidAndActiveTrue(uuid).map(state -> {

            state.setName(stateRequest.getName());
            state.setNumber(stateRequest.getNumber());
            return stateMapper.mapEntityToResponse(stateRepository.updateAudit(state));
        }).orElseThrow(() -> new NoSuchElementException("Error al actualizar estado (state) con ID: " + uuid) {});
    }

    @Override
    public StateResponse deleteById(UUID uuid) {
        return stateMapper.mapEntityToResponse( stateRepository.findByUuidAndActiveTrue(uuid).map(state -> {
            stateRepository.deleteByIdActive(uuid);
            stateRepository.updateAudit(state);
            return state;
        }).orElseThrow(() -> new NoSuchElementException("Error al eliminar usuario con uuid: " + uuid) {}));
    }
}
