package me.ff.microservice.repository;

import me.ff.microservice.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserUserRepository extends JpaRepository<ApplicationUser, Long> {
    Optional<ApplicationUser> findByUserNameOrEmail(String userName, String email);
    Optional<ApplicationUser> findByUserName(String name);
    Optional<ApplicationUser> findByEmail(String email);
}

