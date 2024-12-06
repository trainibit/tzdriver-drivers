package com.trainibit.tzdriver_drivers.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@Data
public class StateRequest {
    @NotNull
    private Long number;

    @NotNull
    private String name;


}
