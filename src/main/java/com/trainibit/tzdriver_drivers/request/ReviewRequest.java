package com.trainibit.tzdriver_drivers.request;

import lombok.Data;

@Data
public class ReviewRequest {
    private Float average;
    private Integer punctuality;
    private Integer safeDriving;
    private Integer friendliness;
    private Integer cleanliness;
    private String comment;

}
