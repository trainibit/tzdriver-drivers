package com.trainibit.tzdriver_drivers.request;

import lombok.Data;

import java.util.List;

@Data
public class DriverRequest {
    private String name;
    private String phoneNumber;
    private Float averageReview; //esta se debera calcular mas adelante si hay 3 calificaciones o mas probablemente puede ser null

}
