package com.jwt_authentication.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

  private static final String SECRET_KEY="";

  public String extractUsername(String jwt) {
    return null;
  }

  private Claims extractAllClaims(String token) {
    return Jwts
      .parserBuilder()
      .setSigningKey(getSignInKey())  //TODO: implement method getSignInKey()
      .build()
      .parseClaimsJws(token)
      .getBody();
  }

}
