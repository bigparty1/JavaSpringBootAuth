package com.kaue.javaspringbootauth.user.service;

import com.kaue.javaspringbootauth.user.repository.UserRepository;
import com.kaue.javaspringbootauth.user.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }

    public Page<User> findByUsernameContaining(String username, Pageable pageable) {
        return userRepository.findByUsernameContaining(username, pageable);
    }

    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public void deleteByUserId(Long userId) {
        userRepository.deleteByUserId(userId);
    }

    public void deleteByUsername(String username) {
        userRepository.deleteByUsername(username);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        if (user.getUserId() == null) {
            throw new IllegalArgumentException("User ID must not be null for update");
        }
        return userRepository.save(user);
    }
}
