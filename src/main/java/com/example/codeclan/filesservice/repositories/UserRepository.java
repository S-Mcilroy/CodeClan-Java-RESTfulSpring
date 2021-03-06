package com.example.codeclan.filesservice.repositories;

import com.example.codeclan.filesservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
