package com.jwt_authentication.config;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

  public String extractUsername(String jwt) {
    return null;
  }

  private Claims extractAllClaims(String token) {
    return null;
  }

}
