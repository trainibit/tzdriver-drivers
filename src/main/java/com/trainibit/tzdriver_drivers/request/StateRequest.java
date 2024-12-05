package com.trainibit.tzdriver_drivers.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Instant;

@Data
public class StateRequest {
    @NotNull
    private Long number;

    @NotNull
    private String name;

    @NotNull
    private Instant createdAt;

    @NotNull
    private Instant updatedAt;

}
