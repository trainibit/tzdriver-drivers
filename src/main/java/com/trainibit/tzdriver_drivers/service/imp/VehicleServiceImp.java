package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.entity.Vehicle;
import com.trainibit.tzdriver_drivers.mapper.DriverMapper;
import com.trainibit.tzdriver_drivers.mapper.ReviewMapper;
import com.trainibit.tzdriver_drivers.mapper.VehicleMapper;
import com.trainibit.tzdriver_drivers.repository.ReviewRepository;
import com.trainibit.tzdriver_drivers.repository.VehicleRepository;
import com.trainibit.tzdriver_drivers.request.VehicleRequest;
import com.trainibit.tzdriver_drivers.response.VehicleResponse;
import com.trainibit.tzdriver_drivers.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@ComponentScan
@Service
public class VehicleServiceImp implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired // me da error
    private @Qualifier("vehicleMapperImpl") VehicleMapper vehicleMapper;

    @Override
    public List<VehicleResponse> findAll() {
        if (vehicleRepository.findByActiveTrue().isEmpty()) {
            throw new NoSuchElementException("Error, No se encontraron vehiculos (vehicles) con active=true");
        }else{
            return vehicleMapper.mapListEntityToListResponse(vehicleRepository.findByActiveTrue()) ;
        }
    }

    @Override
    public VehicleResponse findById(UUID uuid) {
        return null;
    }

    @Override
    public VehicleResponse postVehicle(VehicleRequest vehicleRequest) {
        Vehicle vehicle = vehicleMapper.mapRequestToEntity(vehicleRequest);
        vehicle.setUuid(UUID.randomUUID());
        Vehicle vehicleSaved = vehicleRepository.save(vehicle);
        return vehicleMapper.mapEntityToResponse(vehicleSaved);
    }

    @Override
    public VehicleResponse deleteById(UUID uuid) {
        return null;
    }

    @Override
    public VehicleResponse putById(UUID uuid, VehicleRequest vehicleRequest) {
        return null;
    }

    /*@Override
    public VehicleResponse postVehicle(VehicleRequest vehicleRequest) {
        Vehicle vehicle = vehicleMapper.mapRequestToEntity(vehicleRequest);
        vehicle.setUuid(UUID.randomUUID());
        Vehicle vehicleSaved = vehicleRepository.save(vehicle);
        return vehicleMapper.mapEntityToResponse(vehicleSaved);
    }*/

}
