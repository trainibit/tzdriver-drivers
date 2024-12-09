package com.trainibit.tzdriver_drivers.request;

import com.trainibit.tzdriver_drivers.entity.Score;
import com.trainibit.tzdriver_drivers.entity.State;
import com.trainibit.tzdriver_drivers.entity.Vehicle;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.UUID;

@Data
public class DriverRequest {
    private String name;
    private String phoneNumber;
    private Float averageReview;
    private Score idScore;
    private State idState;
}
