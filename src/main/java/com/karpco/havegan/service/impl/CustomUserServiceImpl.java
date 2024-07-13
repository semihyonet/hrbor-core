package com.karpco.havegan.service.impl;

import com.karpco.havegan.entity.core.User;
import com.karpco.havegan.repository.UserRepository;
import com.karpco.havegan.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomUserServiceImpl implements CustomUserService {
    @Autowired
    UserRepository userRepository;

    /**
     * @param username
     * @return
     */
    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByEmail(username);
    }
}
