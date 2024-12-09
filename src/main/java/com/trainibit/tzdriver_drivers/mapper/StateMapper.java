package com.trainibit.tzdriver_drivers.mapper;

import com.trainibit.tzdriver_drivers.entity.State;
import com.trainibit.tzdriver_drivers.request.StateRequest;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {}, implementationName = "StateMapperImpl")
public interface StateMapper {
    StateResponse mapEntityToResponse(State state);
    State mapRequestToEntity(StateRequest stateRequest);
    List<StateResponse> mapListEntityToListResponse(List<State> state);

}
