package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.mapper.StateMapper;
import com.trainibit.tzdriver_drivers.repository.StateRepository;
import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import com.trainibit.tzdriver_drivers.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class StateServiceImp implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public List<StateResponse> findAll() {
        /*if (stateRepository.findByActiveTrue().isEmpty()) {
            throw new NoSuchElementException("Error, No se encontro usuarios active=true");
        }else{
            return StateMapper.mapListEntityToListDto(stateRepository.findByActiveTrue()) ;
        }*/

        return List.of();
    }

    @Override
    public StateResponse findById(UUID uuid) {
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
