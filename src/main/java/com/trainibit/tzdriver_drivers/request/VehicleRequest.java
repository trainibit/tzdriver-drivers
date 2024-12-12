package com.trainibit.tzdriver_drivers.request;

import lombok.Data;

import java.util.List;


@Data
public class VehicleRequest {

    private String mark;
    private String color;
    private String plateNumber;
    private Long passagerCapacity;

    // debe permitir recibir una lista de conductores
    private List<DriverRequest> drivers;

}
