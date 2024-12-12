package com.trainibit.tzdriver_drivers.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "states")
public class State extends AuditableRecord{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number", nullable = false)
    private Long number;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "uuid")
    private UUID uuid;

    //@OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    //private List<Driver> drivers;

    //    @OneToMany(mappedBy = "idState")
    //    private List<Driver> drivers = new ArrayList<>();

}