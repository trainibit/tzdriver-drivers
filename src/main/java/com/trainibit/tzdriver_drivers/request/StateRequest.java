package com.trainibit.tzdriver_drivers.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StateRequest {
    @NotNull
    private Long number;

    @NotNull
    private String name;


}
