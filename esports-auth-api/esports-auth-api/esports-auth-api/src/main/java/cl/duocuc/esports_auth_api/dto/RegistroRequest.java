package cl.duocuc.esports_auth_api.dto;

import lombok.Data;

@Data
public class RegistroRequest {
    private String username;
    private String password;
    private String email;
    private Long idPlan;
}