package me.sayjang.springbootblog.controller;

import lombok.RequiredArgsConstructor;
import me.sayjang.springbootblog.dto.CreateAccessTokenRequest;
import me.sayjang.springbootblog.dto.CreateAcessTokenResponse;
import me.sayjang.springbootblog.service.TokenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TokenApiController {

    private final TokenService tokenService;

    @PostMapping("/api/token")
    public ResponseEntity<CreateAcessTokenResponse> createNewAccessToken(@RequestBody CreateAccessTokenRequest request) {
        String newAccessToken = tokenService.createNewAccessToken(request.getRefreshToken());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CreateAcessTokenResponse(newAccessToken));
    }
}
