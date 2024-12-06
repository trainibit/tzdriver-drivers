package com.trainibit.tzdriver_drivers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface AuditableRepository<T, ID> extends JpaRepository<T, ID> {
    void deleteByIdActive(UUID uuid);

    T updateAudit(T t);
}
