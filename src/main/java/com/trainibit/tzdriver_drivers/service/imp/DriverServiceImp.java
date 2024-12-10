package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.request.DriverRequest;
import com.trainibit.tzdriver_drivers.response.DriverResponse;
import com.trainibit.tzdriver_drivers.service.DriverService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@ComponentScan
@Service
public class DriverServiceImp implements DriverService {

    @Override
    public List<DriverResponse> findAll() {
        return List.of();
    }

    @Override
    public DriverResponse findById(UUID uuid) {
        return null;
    }

    @Override
    public DriverResponse postState(DriverRequest driverRequest) {
        return null;
    }

    @Override
    public DriverResponse deleteById(UUID uuid) {
        return null;
    }

    @Override
    public DriverResponse putById(UUID uuid, DriverRequest driverRequest) {
        return null;
    }
}
