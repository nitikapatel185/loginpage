package com.example.Practice.repository;
import com.example.Practice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("rawtypes")
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}