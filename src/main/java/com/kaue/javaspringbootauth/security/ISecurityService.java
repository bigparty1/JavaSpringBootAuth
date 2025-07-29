package com.kaue.javaspringbootauth.security;

public interface ISecurityService {
    String generateSalt(int length);
    String hashPassword(String password, String salt);
}
