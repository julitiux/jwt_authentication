package com.jwt_authentication.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

  @Bean
  public UserDetailsService userDetailsService() {
    return username -> null;
  }

}
