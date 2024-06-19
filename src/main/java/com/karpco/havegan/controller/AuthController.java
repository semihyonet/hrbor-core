package com.karpco.havegan.controller;

import com.karpco.havegan.dto.auth.JWTAuthResponse;
import com.karpco.havegan.dto.auth.SignupRequest;
import com.karpco.havegan.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@RestController
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/login")
    public String login() {
        return "Am I working?";
    }

    @PostMapping("/signup")
    public JWTAuthResponse signup(@RequestBody SignupRequest signupRequest) {
        JWTAuthResponse response = authService.signup(signupRequest);

        return response;
    }
}
