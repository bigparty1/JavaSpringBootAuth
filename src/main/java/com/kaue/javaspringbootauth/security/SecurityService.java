package com.kaue.javaspringbootauth.security;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class SecurityService implements ISecurityService {

    @Override
    public String generateSalt(int length) {
        byte[] salt = new byte[length];
        new SecureRandom().nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    @Override
    public String hashPassword(String password, String salt) {
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            String saltedPassword = salt + password + salt;
            byte[] hashedBytes = sha256.digest(saltedPassword.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(hashedBytes);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar hash", e);
        }
    }
}