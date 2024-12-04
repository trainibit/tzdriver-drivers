package com.trainibit.tzdriver_drivers.request;

import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Data
public class StateRequest {
    private Long number;
    private String name;
    private Instant createdAt;
    private Instant updatedAt;

}
