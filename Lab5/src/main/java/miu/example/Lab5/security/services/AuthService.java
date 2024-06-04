package miu.example.Lab5.security.services;

import miu.example.Lab5.dtos.LoginRequest;
import miu.example.Lab5.dtos.LoginResponse;
import miu.example.Lab5.dtos.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
