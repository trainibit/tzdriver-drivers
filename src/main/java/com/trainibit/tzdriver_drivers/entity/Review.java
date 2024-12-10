package com.trainibit.tzdriver_drivers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "reviews")
public class Review  extends AuditableRecord{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "id_driver", nullable = false)
    private Long idDriver;

    @Column(name = "average", nullable = false)
    private Float average;

    @Column(name = "punctuality", nullable = false)
    private Integer punctuality;

    @Column(name = "safe_driving", nullable = false)
    private Integer safeDriving;

    @Column(name = "friendliness", nullable = false)
    private Integer friendliness;

    @Column(name = "cleanliness", nullable = false)
    private Integer cleanliness;

    @Column(name = "comment", length = Integer.MAX_VALUE)
    private String comment;
}