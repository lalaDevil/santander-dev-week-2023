package me.dio.domain.repository;

import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { //<entidade, tipo do iodentificador id>
    boolean existsByAccountNumber(String accountNumber);
}
