package com.trainibit.tzdriver_drivers.repository;

import com.trainibit.tzdriver_drivers.AuditableRepository;
import com.trainibit.tzdriver_drivers.entity.State;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StateRepository extends AuditableRepository<State, Long> {

    default void deleteByIdActive(UUID uuid){
        State entity = findByUuidAndActiveTrue(uuid).get();
        entity.setActive(false);
        save(entity);
    }

    Optional<State> findByUuidAndActiveTrue(UUID uuid);

    List<State> findByActiveTrue();

    @Override
    default State updateAudit(State entity) {
        entity.setUpdatedAt(Timestamp.from(Instant.now()));
        return save(entity);
    }

}
