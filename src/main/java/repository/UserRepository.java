package repository;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository {
    Optional<User> findByUuid(UUID uuid);
}