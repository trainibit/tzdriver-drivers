package com.trainibit.tzdriver_drivers.repository;

import com.trainibit.tzdriver_drivers.entity.Review;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReviewRepository extends AuditableRepository<Review, Long>{
    default void deleteByIdActive(UUID uuid){
        Review entity = findByUuidAndActiveTrue(uuid).get();
        entity.setActive(false);
        save(entity);
    }

    Optional<Review> findByUuidAndActiveTrue(UUID uuid);

    List<Review> findByActiveTrue();

    @Override
    default Review updateAudit(Review entity) {
        entity.setUpdatedAt(Timestamp.from(Instant.now()));
        return save(entity);
    }
}
