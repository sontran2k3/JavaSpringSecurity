package com.example.JavaSpringSecurity.repository;

import com.example.JavaSpringSecurity.entity.InvalidatedToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvalidateTokenRepository extends JpaRepository<InvalidatedToken, String> {
}
