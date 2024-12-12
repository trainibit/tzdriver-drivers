package com.trainibit.tzdriver_drivers.service;

import com.trainibit.tzdriver_drivers.request.VehicleRequest;
import com.trainibit.tzdriver_drivers.response.VehicleResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface VehicleService {
    List<VehicleResponse> findAll();

    VehicleResponse findById(UUID uuid);

    VehicleResponse postVehicle(VehicleRequest vehicleRequest);

    VehicleResponse deleteById(UUID uuid);

    VehicleResponse putById(UUID uuid, VehicleRequest vehicleRequest);
}
