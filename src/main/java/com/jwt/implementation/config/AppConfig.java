package com.jwt.implementation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
//    UserDetailsService contains 'loadUserByUsername', so now our configured user will be able to log-in.
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user01 = User.builder().username("lalitsiraswa")
                .password(passwordEncoder().encode("siraswalalit"))
                .roles("ADMIN")
                .build();
        UserDetails user02 = User.builder().username("surajdadheech")
                .password(passwordEncoder().encode("dadheechsuraj"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user01, user02);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}
