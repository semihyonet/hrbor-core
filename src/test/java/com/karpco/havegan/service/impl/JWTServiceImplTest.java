package com.karpco.havegan.service.impl;

import com.karpco.havegan.entity.core.User;
import com.karpco.havegan.service.JWTService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@AutoConfigureMockMvc
class JWTServiceImplTest {
    @Autowired
    private JWTService jwtService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    void generateToken() {
        User user = new User();
        user.setFirstName("test");
        user.setLastName("test");
        user.setUsername("test");
        user.setEmail("test");
        user.setPassword("Test");
        Authentication authentication = mock(Authentication.class);

        when(authentication.getPrincipal()).thenReturn(user);

        String token = this.jwtService.generateToken(authentication);
        System.out.println(token);

        assertNotNull(token);
    }

    @Test
    void generateTokenWithUserName() {
    }

    @Test
    void getJwtExpirationInMillis() {
    }
}