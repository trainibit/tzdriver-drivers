package com.trainibit.tzdriver_drivers.mapper;

import com.trainibit.tzdriver_drivers.entity.Vehicle;
import com.trainibit.tzdriver_drivers.request.VehicleRequest;
import com.trainibit.tzdriver_drivers.response.VehicleResponse;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DriverMapper.class}, implementationName = "VehicleMapperImpl")
public interface VehicleMapper {
    VehicleResponse mapEntityToResponse(Vehicle vehicle);
    Vehicle mapRequestToEntity(VehicleRequest vehicleRequest);
    List<VehicleResponse> mapListEntityToListResponse(List<Vehicle> vehicles);

    // Si se necesita asociar cada conductor a el vehiculo en la relacion a cascada:
    @AfterMapping
    default void linkDrivers(@MappingTarget Vehicle vehicle, VehicleRequest vehicleRequest) {
        if (vehicle.getDrivers() != null) {
            vehicle.getDrivers().forEach(driver -> driver.setVehicle(vehicle));
        }
    }

}
