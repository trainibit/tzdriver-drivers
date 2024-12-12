package com.trainibit.tzdriver_drivers.mapper;

import com.trainibit.tzdriver_drivers.entity.Driver;
import com.trainibit.tzdriver_drivers.request.DriverRequest;
import com.trainibit.tzdriver_drivers.response.DriverResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", implementationName = "DriverMapperImpl")
public interface DriverMapper {
    Driver mapRequestToEntity(DriverRequest driverRequest);

    DriverResponse mapEntityToResponse(Driver driver);

    List<Driver> mapRequestListToEntityList(List<DriverRequest> driverRequests);

    List<DriverResponse> mapEntityListToResponseList(List<Driver> drivers);

}
