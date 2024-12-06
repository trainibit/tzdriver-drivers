package com.trainibit.tzdriver_drivers.mapper;

import com.trainibit.tzdriver_drivers.entity.State;
import com.trainibit.tzdriver_drivers.response.StateResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StateMapper {
    StateResponse mapEntityToDto(State state);
    State mapDtoToEntity(StateResponse dto);
    List<StateResponse> mapListEntityToListDto(List<State> state);
    List<StateResponse> mapListDtoToListEntity(List<State> state);

}
