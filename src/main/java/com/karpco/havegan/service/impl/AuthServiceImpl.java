package com.karpco.havegan.service.impl;

import com.karpco.havegan.dto.auth.JWTAuthResponse;
import com.karpco.havegan.dto.auth.LoginRequest;
import com.karpco.havegan.dto.auth.SignupRequest;
import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.core.User;
import com.karpco.havegan.repository.UserRepository;
import com.karpco.havegan.service.AuthService;
import com.karpco.havegan.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    UserRepository userRepository;

    private final AuthenticationManager authenticationManager;

    private final JWTService jwtService;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthServiceImpl(AuthenticationManager authenticationManager, JWTService jwtService, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
    }


    public JWTAuthResponse login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(),
                loginRequest.getPassword()));
        String token = jwtService.generateToken(authenticate);

        //TODO add refresh token
        return JWTAuthResponse
                .builder()
                .token(token)
                .refreshToken(token)
                .build();

    }

    public JWTAuthResponse refreshToken(String refreshToken) {
        return null;
    }

    public JWTAuthResponse signup(SignupRequest signupRequest) {
        User user = new User();

        user.setEmail(signupRequest.getEmail());

        user.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        user.setUsername(signupRequest.getUsername());

        user.setFirstName(signupRequest.getFirstName());
        user.setLastName(signupRequest.getLastName());

        User savedUser = userRepository.save(user);

        Organization organization = new Organization();
        organization.setName(signupRequest.getOrganizationName());
        ArrayList<User> users = new ArrayList<>();
        users.add(savedUser);

        organization.setUsers(users);


        UsernamePasswordAuthenticationToken usernameAuthToken = new UsernamePasswordAuthenticationToken(
                savedUser.getEmail(),
                signupRequest.getPassword()
        );
        Authentication authenticate = authenticationManager.authenticate(usernameAuthToken);
        String token = jwtService.generateToken(authenticate);

        //TODO add refresh token
        return JWTAuthResponse
                .builder()
                .token(token)
                .refreshToken(token)
                .build();
    }
}
