package com.zsgs.zira.controller;


import com.zsgs.zira.dto.AuthenticationRequest;
import com.zsgs.zira.dto.AuthenticationResponse;
import com.zsgs.zira.dto.RegisterRequest;
import com.zsgs.zira.service.AuthenticationService;
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
