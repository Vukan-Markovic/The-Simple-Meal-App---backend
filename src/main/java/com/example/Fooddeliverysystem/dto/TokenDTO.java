package com.example.Fooddeliverysystem.dto;

import java.io.Serializable;

public class TokenDTO implements Serializable {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenDTO() {
    }
}