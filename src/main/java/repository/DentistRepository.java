package repository;

import entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DentistRepository extends JpaRepository {
    Optional<Dentist> findByUuid(UUID uuid);
}