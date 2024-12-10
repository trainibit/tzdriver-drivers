package com.trainibit.tzdriver_drivers.request;

import lombok.Data;

@Data
public class DriverRequest {
    private String name;
    private String phoneNumber;
    private Float averageReview;
}
