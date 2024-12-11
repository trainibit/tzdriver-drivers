package com.trainibit.tzdriver_drivers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "vehicles")
public class Vehicle extends AuditableRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "mark", nullable = false, length = Integer.MAX_VALUE)
    private String mark;

    @Column(name = "color", nullable = false, length = Integer.MAX_VALUE)
    private String color;

    @Column(name = "plate_number", nullable = false, length = Integer.MAX_VALUE)
    private String plateNumber;

    @Column(name = "passager_capacity", nullable = false)
    private Long passagerCapacity;

    // Relación OneToMany con Driver
    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Driver> drivers = new ArrayList<>();
}