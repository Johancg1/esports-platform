package cl.duocuc.esports_auth_api.dto;

import lombok.*;

@Getter @Setter
public class UsuarioResponse {
    private Long id;
    private String username;
    private String email;
    private String nombrePlan;
}