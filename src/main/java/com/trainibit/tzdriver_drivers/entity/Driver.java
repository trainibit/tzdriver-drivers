package com.trainibit.tzdriver_drivers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "drivers")
public class Driver extends AuditableRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "phone_number", nullable = false, length = 10)
    private String phoneNumber;

    @Column(name = "average_review", nullable = false)
    private Float averageReview;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @JoinColumn(name = "id_state", nullable = false)
    private Long idState;

    // Relación ManyToOne con Vehicle
    @ManyToOne
    @JoinColumn(name = "id_vehicle", nullable = false) // Llave foránea hacia Vehicle
    private Vehicle vehicle;

}