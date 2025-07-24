package com.kaue.javaspringbootauth.controller;

import com.kaue.javaspringbootauth.user.model.entity.User;
import com.kaue.javaspringbootauth.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/username/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/id/{userId}")
    public User findByUserId(@PathVariable Long userId) {
        return userService.findByUserId(userId);
    }

    @GetMapping("/search")
    public Page<User> findByUsernameContaining(@RequestParam String username, Pageable pageable) {
        return userService.findByUsernameContaining(username, pageable);
    }

    @GetMapping
    public Page<User> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @DeleteMapping("/id/{userId}")
    public void deleteByUserId(@PathVariable Long userId) {
        userService.deleteByUserId(userId);
    }

    @DeleteMapping("/username/{username}")
    public void deleteByUsername(@PathVariable String username) {
        userService.deleteByUsername(username);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}
