package com.trainibit.tzdriver_drivers.repository;

import com.trainibit.tzdriver_drivers.entity.Vehicle;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VehicleRepository extends AuditableRepository<Vehicle, Long>{
    Optional<Vehicle> findByUuidAndActiveTrue(UUID uuid);

    List<Vehicle> findByActiveTrue();

    @Override
    default Vehicle updateAudit(Vehicle entity) {
        entity.setUpdatedAt(Timestamp.from(Instant.now()));
        return save(entity);
    }

    default void deleteByIdActive(UUID uuid){
        Vehicle entity = findByUuidAndActiveTrue(uuid).get();
        entity.setActive(false);
        save(entity);
    }

}
