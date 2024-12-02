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
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "mark", nullable = false, length = Integer.MAX_VALUE)
    private String mark;

    @Column(name = "color", nullable = false, length = Integer.MAX_VALUE)
    private String color;

    @Column(name = "model", nullable = false, length = Integer.MAX_VALUE)
    private String model;

    @Column(name = "year")
    private Long year;

    @Column(name = "plate_number", nullable = false, length = Integer.MAX_VALUE)
    private String plateNumber;

    @Column(name = "passager_capacity", nullable = false)
    private Long passagerCapacity;

    @ColumnDefault("true")
    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "update_at", nullable = false)
    private Instant updateAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @OneToMany(mappedBy = "idVehicle")
    private List<Driver> drivers = new ArrayList<>();

}