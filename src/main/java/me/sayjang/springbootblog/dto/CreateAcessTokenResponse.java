package me.sayjang.springbootblog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateAcessTokenResponse {
    private String accessToken;
}
