package repository;

import entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface ClaimRepository extends JpaRepository {
    Optional<Claim> findByUuid(UUID uuid);
}
