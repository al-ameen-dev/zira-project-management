package com.alameen.jwtsecurity.service;

import com.alameen.jwtsecurity.dto.AuthenticationRequest;
import com.alameen.jwtsecurity.dto.AuthenticationResponse;
import com.alameen.jwtsecurity.dto.RegisterRequest;
import com.alameen.jwtsecurity.entity.Role;
import com.alameen.jwtsecurity.entity.User;
import com.alameen.jwtsecurity.repository.UserRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final UserRespository userRespository;
    public AuthenticationResponse register(RegisterRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName((request.getLastName()))
                .email(request.getEmail())
                .role(Role.USER)
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        userRespository.save(user);
        String token = jwtService.generateTokenForUser(user);
        return AuthenticationResponse.builder().token(token)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request)
    {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = userRespository.findByEmail(request.getEmail())
                .orElseThrow();
        String token = jwtService.generateTokenForUser(user);
        return AuthenticationResponse.builder().token(token)
                .build();
    }
}
