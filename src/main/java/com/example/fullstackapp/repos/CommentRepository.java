package com.example.fullstackapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstackapp.entites.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
