package com.trainibit.tzdriver_drivers.service.imp;

import com.trainibit.tzdriver_drivers.entity.Driver;
import com.trainibit.tzdriver_drivers.entity.State;
import com.trainibit.tzdriver_drivers.mapper.DriverMapper;
import com.trainibit.tzdriver_drivers.repository.DriverRepository;
import com.trainibit.tzdriver_drivers.request.DriverRequest;
import com.trainibit.tzdriver_drivers.response.DriverResponse;
import com.trainibit.tzdriver_drivers.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@ComponentScan
@Service
public class DriverServiceImp implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private @Qualifier("driverMapperImpl") DriverMapper driverMapper;

    @Override
    public List<DriverResponse> findAll() {
        if (driverRepository.findByActiveTrue().isEmpty()) {
            throw new NoSuchElementException("Error, No se encontraron Conductores (drivers) con active=true");
        }else{
            return driverMapper.mapEntityListToResponseList(driverRepository.findByActiveTrue()) ;
        }
    }

    @Override
    public DriverResponse findById(UUID uuid) {
        return null;
    }

    @Override
    public DriverResponse postDriver(DriverRequest driverRequest) {
        Driver driver = driverMapper.mapRequestToEntity(driverRequest);
        driver.setUuid(UUID.randomUUID());
        Driver driverSaved = driverRepository.save(driver);
        return driverMapper.mapEntityToResponse(driverSaved);

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
