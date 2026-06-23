package cl.duocuc.esports_auth_api.service;

import cl.duocuc.esports_auth_api.client.EsportsClient;
import cl.duocuc.esports_auth_api.dto.ApiResponse;
import cl.duocuc.esports_auth_api.dto.UsuarioResponse;
import cl.duocuc.esports_auth_api.dto.PlanResponse;
import cl.duocuc.esports_auth_api.dto.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EsportsService {

    private final EsportsClient esportsClient;

    public ApiResponse<List<UsuarioResponse>> listarSocios() {

        ApiResponse<List<UsuarioResponse>> respuesta = new ApiResponse<>();


        respuesta.setData(esportsClient.obtenerSocios());

        return respuesta;
    }

    public ApiResponse<List<PlanResponse>> listarPlanes() {

        ApiResponse<List<PlanResponse>> respuesta = new ApiResponse<>();

        respuesta.setData(esportsClient.obtenerPlanes());

        return respuesta;
    }

    public String loginSencillo(LoginRequest loginRequest) {
        if(loginRequest.getUsername().equals("admin") && loginRequest.getPassword().equals("1234")) {
            return "Login OK";
        } else {
            return "Error";
        }
    }
}