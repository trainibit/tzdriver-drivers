package com.trainibit.tzdriver_drivers.response;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class StateResponse {

    private Long number; // entero largo
    private String name;

    // aqui tambien van los datos que se se deben calcular como uuid
    private UUID uuid;
}
