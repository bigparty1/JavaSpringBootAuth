package com.kaue.javaspringbootauth.user.repository;

import com.kaue.javaspringbootauth.user.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByUserId(Long userId);
    Page<User> findByUsernameContaining(String username, Pageable pageable);
    Page<User> findAll(Pageable pageable);
    void deleteByUserId(Long userId);
    void deleteByUsername(String username);
}