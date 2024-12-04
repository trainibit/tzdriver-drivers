package com.trainibit.tzdriver_drivers.response;

import lombok.Data;

import java.time.Instant;

@Data
public class StateResponse {
    private Long number;
    private String name;
    private Instant createdAt;
    private Instant updatedAt;
}
