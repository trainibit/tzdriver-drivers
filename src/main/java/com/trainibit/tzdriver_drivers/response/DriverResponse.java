package com.trainibit.tzdriver_drivers.response;


import lombok.Data;

import java.util.UUID;

@Data
public class DriverResponse {
    private String name;
    private String phoneNumber;
    private Float averageReview;

    private Long idState;
    private Long idVehicle;
    private UUID uuid;
}
