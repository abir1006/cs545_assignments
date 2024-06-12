package miu.example.Lab7_backend.security.services;

import miu.example.Lab7_backend.dtos.LoginRequest;
import miu.example.Lab7_backend.dtos.LoginResponse;
import miu.example.Lab7_backend.dtos.RefreshTokenRequest;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
