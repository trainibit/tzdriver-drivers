package com.trainibit.tzdriver_drivers.service;

import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface StateService {
    List<StateResponse> findAll();

    StateResponse findById(UUID uuid);

    StateResponse postState(StateRequest stateRequest);

    StateResponse deleteById(UUID uuid);

    StateResponse putById(UUID uuid, StateRequest stateRequest);

}
