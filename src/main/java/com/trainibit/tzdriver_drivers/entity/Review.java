package com.trainibit.tzdriver_drivers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private UUID uuidReview;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

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