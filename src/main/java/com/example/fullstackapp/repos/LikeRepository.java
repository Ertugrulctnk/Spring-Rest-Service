package com.example.fullstackapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackapp.entites.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{

}
