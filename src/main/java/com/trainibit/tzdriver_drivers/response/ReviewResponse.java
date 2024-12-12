package com.trainibit.tzdriver_drivers.response;

import lombok.Data;

import java.util.UUID;

@Data
public class ReviewResponse {
    private Float average;
    private Integer punctuality;
    private Integer safeDriving;
    private Integer friendliness;
    private Integer cleanliness;
    private String comment;

    private UUID uuid;
    private Long idDriver;
}
