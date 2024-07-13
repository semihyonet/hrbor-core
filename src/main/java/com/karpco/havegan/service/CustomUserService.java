package com.karpco.havegan.service;

import com.karpco.havegan.entity.core.User;

public interface CustomUserService {
    public User loadUserByUsername(String username);
}
