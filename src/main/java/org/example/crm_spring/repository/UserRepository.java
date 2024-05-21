package org.example.crm_spring.repository;

import org.example.crm_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select u from User u where u.email=:email")
    Optional<User> findByEmail(@Param(value = "email") String email);
}
