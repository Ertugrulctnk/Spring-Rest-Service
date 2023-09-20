package com.example.fullstackapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackapp.entites.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
