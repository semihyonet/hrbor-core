package com.karpco.havegan.service;

import com.karpco.havegan.dto.auth.JWTAuthResponse;
import com.karpco.havegan.dto.auth.LoginRequest;
import com.karpco.havegan.dto.auth.SignupRequest;


public interface AuthService {

    public JWTAuthResponse login(LoginRequest loginRequest);

    public JWTAuthResponse refreshToken(String refreshToken);

    public JWTAuthResponse signup(SignupRequest signupRequest);
}
