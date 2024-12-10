package com.trainibit.tzdriver_drivers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
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

    //@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vehicle", nullable = false)
    private Long idVehicle;

    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_state", nullable = false)
    private Long idState;

    //    @OneToMany(mappedBy = "idState")
    //    private List<Driver> drivers = new ArrayList<>();
}