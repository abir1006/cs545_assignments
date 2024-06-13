package miu.example.Lab8_backend.security.services;

import miu.example.Lab8_backend.dtos.LoginRequest;
import miu.example.Lab8_backend.dtos.LoginResponse;
import miu.example.Lab8_backend.dtos.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
