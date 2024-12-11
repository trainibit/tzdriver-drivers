package com.trainibit.tzdriver_drivers.response;

import lombok.Data;

import java.util.UUID;

@Data
public class VehicleResponse {

    private String mark;
    private String color;
    private String plateNumber;
    private Long passagerCapacity;

    // mas los datos calculados
    private UUID uuid;
}
