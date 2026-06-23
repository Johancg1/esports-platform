package cl.duocuc.esports_auth_api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Username obligatorio")
    private String username;
    @NotBlank(message = "Password obligatoria")
    private String password;
}