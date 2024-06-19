package com.karpco.havegan.dto.auth;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JWTAuthResponse {
    private String token;

    private String refreshToken;

    private String tokenType = "Bearer";

    private Long expiresIn;
}
