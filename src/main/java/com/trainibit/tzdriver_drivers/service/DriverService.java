package com.trainibit.tzdriver_drivers.service;

import com.trainibit.tzdriver_drivers.request.DriverRequest;
import com.trainibit.tzdriver_drivers.response.DriverResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface DriverService {
    List<DriverResponse> findAll();

    DriverResponse findById(UUID uuid);

    DriverResponse postState(DriverRequest driverRequest);

    DriverResponse deleteById(UUID uuid);

    DriverResponse putById(UUID uuid, DriverRequest driverRequest);

}
