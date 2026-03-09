package com.sp.secu.config;

import org.springframework.boot.security.autoconfigure.web.servlet.SecurityFilterProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) {
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
//        http.authorizeHttpRequests((requests) -> requests.anyRequest().denyAll());

        http.authorizeHttpRequests((requests) ->
                requests.requestMatchers("/user-account").authenticated()
                        .requestMatchers("/user-balance").authenticated()
                        .requestMatchers("/user-loans").authenticated()
                        .requestMatchers("/user-cards").authenticated()
                        .requestMatchers("/contacts").permitAll()
                        .requestMatchers("/notices").permitAll()
                        .requestMatchers("/error").permitAll());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }
}
