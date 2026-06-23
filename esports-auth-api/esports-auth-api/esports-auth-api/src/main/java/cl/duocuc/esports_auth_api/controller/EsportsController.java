package cl.duocuc.esports_auth_api.controller;

import cl.duocuc.esports_auth_api.dto.ApiResponse;
import cl.duocuc.esports_auth_api.dto.UsuarioResponse;
import cl.duocuc.esports_auth_api.dto.PlanResponse;
import cl.duocuc.esports_auth_api.dto.LoginRequest;
import cl.duocuc.esports_auth_api.service.EsportsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/esports")
@RequiredArgsConstructor
public class EsportsController {

    private final EsportsService esportsService;


    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginRequest loginRequest) {
        return esportsService.loginSencillo(loginRequest);
    }


    @GetMapping("/socios")
    public ApiResponse<List<UsuarioResponse>> obtenerSocios() {
        return esportsService.listarSocios();
    }


    @GetMapping("/planes")
    public ApiResponse<List<PlanResponse>> obtenerPlanes() {
        return esportsService.listarPlanes();
    }


    @GetMapping("/saludo")
    public String saludoBienvenida() {
        return "Bienvenido al portal de E-Sports";
    }


    @GetMapping("/version")
    public String obtenerVersion() {
        return "Versión de la API: 1.0.0";
    }
}