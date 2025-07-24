/**
 * User.java
 * @author Kauê Gomes
 */

package com.kaue.javaspringbootauth.user.model.entity;

import jakarta.persistence.*;

/**
 * Representa um usuário no sistema.
 * A classe User é uma entidade JPA que mapeia a tabela "user" no banco de dados.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String hash;

    @Column(nullable = false)
    private String salt;

    @Column(nullable = false)
    private String role;

    public User() {}

    public User(String username, String hash, String salt, String role) {
        this.username = username;
        this.hash = hash;
        this.salt = salt;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", hash='" + hash + '\'' +
                ", salt='" + salt + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
