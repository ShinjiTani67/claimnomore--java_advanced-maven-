package repository;


import entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EnterpriseRepository extends JpaRepository {
    Optional<Enterprise> findByUuid(UUID uuid);
}

