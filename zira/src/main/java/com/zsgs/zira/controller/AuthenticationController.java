package com.alameen.jwtsecurity.controller;


import com.alameen.jwtsecurity.dto.AuthenticationRequest;
import com.alameen.jwtsecurity.dto.AuthenticationResponse;
import com.alameen.jwtsecurity.dto.RegisterRequest;
import com.alameen.jwtsecurity.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> reigster(
            @RequestBody RegisterRequest request
    )
    {
       return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
            )
    {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
