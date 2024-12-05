package com.trainibit.tzdriver_drivers.mapper;

import com.trainibit.tzdriver_drivers.entity.State;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StateMapper {
    StateResponse mapEntityToDto(State state);
    State mapDtoToEntity(StateResponse dto);


}
