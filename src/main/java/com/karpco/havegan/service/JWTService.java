package com.karpco.havegan.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

public interface JWTService {
    public String generateToken(Authentication authentication);
    public String generateTokenWithUserName(String username);
}

