package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import com.trainibit.tzdriver_drivers.service.StateService;

import java.util.List;
import java.util.UUID;

public class StateServiceImp implements StateService {

    @Override
    public List<StateResponse> findAll() {
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
