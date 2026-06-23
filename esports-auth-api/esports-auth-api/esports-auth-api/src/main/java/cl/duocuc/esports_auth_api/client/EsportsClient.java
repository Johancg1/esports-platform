package cl.duocuc.esports_auth_api.client;

import cl.duocuc.esports_auth_api.dto.UsuarioResponse;
import cl.duocuc.esports_auth_api.dto.PlanResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "esports-core-client", url = "http://localhost:8081/api")
public interface EsportsClient {


    @GetMapping("/socios")
    List<UsuarioResponse> obtenerSocios();

    @GetMapping("/planes")
    List<PlanResponse> obtenerPlanes();
}