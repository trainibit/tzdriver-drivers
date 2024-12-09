package com.trainibit.tzdriver_drivers.response;

import com.trainibit.tzdriver_drivers.entity.Score;
import com.trainibit.tzdriver_drivers.entity.State;

import java.util.UUID;

public class DriverResponse {
    private String name;
    private String phoneNumber;
    private Float averageReview;
    private Score idScore;
    private State idState;

    private UUID uuidDriver;
}
