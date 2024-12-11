package com.trainibit.tzdriver_drivers.request;

import lombok.Data;


@Data
public class VehicleRequest {
    private String mark;
    private String color;
    private String plateNumber;
    private Long passagerCapacity;

}
