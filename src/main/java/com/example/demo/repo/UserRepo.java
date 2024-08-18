package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {
    @Override
    Optional<User> findById(UUID id);
    User findByPhoneNumber(String phoneNumber);
}
