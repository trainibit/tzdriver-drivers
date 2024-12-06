package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.mapper.StateMapper;
import com.trainibit.tzdriver_drivers.repository.StateRepository;
import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import com.trainibit.tzdriver_drivers.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private StateMapper stateMapper;

    @Override
    public List<StateResponse> findAll() {
        if (stateRepository.findByActiveTrue().isEmpty()) {
            throw new NoSuchElementException("Error, No se encontraron estados (states) con active=true");
        }else{
            return stateMapper.mapListEntityToListDto(stateRepository.findByActiveTrue()) ;
        }

        //return List.of();
    }

    @Override
    public StateResponse findById(UUID uuid) {
        //usuarioMapper.mapEntityToDto(usuarioRepository.findByUuidAndActiveTrue(uuid).orElseThrow(() -> new NoSuchElementException("Error al buscar usuario con ID: " + uuid){}));

        return null;
    }

    @Override
    public StateResponse postState(StateRequest stateRequest) {
        return null;
    }

    @Override
    public StateResponse deleteById(UUID uuid) {
        return null;
    }

    @Override
    public StateResponse putById(UUID uuid, StateRequest stateRequest) {
        return null;
    }
}
