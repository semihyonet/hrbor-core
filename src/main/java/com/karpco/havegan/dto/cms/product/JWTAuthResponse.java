package com.karpco.havegan.dto.cms.product;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTAuthResponse {
    private String token;

    private String refreshToken;

    private String tokenType = "Bearer";

    private Long expiresIn;
}
