package com.karpco.havegan.dto.auth;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class SignupRequest {
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String organizationName;
}
