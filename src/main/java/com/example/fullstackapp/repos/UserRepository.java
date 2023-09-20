package com.example.fullstackapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackapp.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
