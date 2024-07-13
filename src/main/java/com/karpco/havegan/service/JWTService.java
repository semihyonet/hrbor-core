package com.karpco.havegan.service;

import com.karpco.havegan.entity.core.User;
import com.karpco.havegan.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {
    public String generateToken(Authentication authentication);

    public String generateTokenWithUserName(String username);
}

