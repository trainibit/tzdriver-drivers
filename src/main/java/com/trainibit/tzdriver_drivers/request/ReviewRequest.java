package com.trainibit.tzdriver_drivers.request;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.UUID;

@Data
public class ReviewRequest {
    private Float average;
    private Integer punctuality;
    private Integer safeDriving;
    private Integer friendliness;
    private Integer cleanliness;
    private String comment;

}
