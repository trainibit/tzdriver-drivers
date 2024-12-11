package com.trainibit.tzdriver_drivers.repository;

import com.trainibit.tzdriver_drivers.entity.Driver;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DriverRepository extends AuditableRepository<Driver, Long>{

    Optional<Driver> findByUuidAndActiveTrue(UUID uuid);

    List<Driver> findByActiveTrue();

    default void deleteByIdActive(UUID uuid){
        Driver entity = findByUuidAndActiveTrue(uuid).get();
        entity.setActive(false);
        save(entity);
    }

    @Override
    default Driver updateAudit(Driver entity) {
        entity.setUpdatedAt(Timestamp.from(Instant.now()));
        return save(entity);
    }

}
