package cl.duocuc.esports_auth_api;

import cl.duocuc.esports_auth_api.client.EsportsClient;
import cl.duocuc.esports_auth_api.dto.*;
import cl.duocuc.esports_auth_api.service.EsportsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EsportsServiceTest {

    @Mock
    private EsportsClient esportsClient;

    @InjectMocks
    private EsportsService esportsService;

    @Test
    void loginSencillo_conCredencialesCorrectas_retornaLoginOk() {
        LoginRequest request = new LoginRequest();
        request.setUsername("admin");
        request.setPassword("1234");

        String resultado = esportsService.loginSencillo(request);

        assertEquals("Login OK", resultado);
    }

    @Test
    void loginSencillo_conCredencialesIncorrectas_retornaError() {
        LoginRequest request = new LoginRequest();
        request.setUsername("usuario");
        request.setPassword("mala");

        String resultado = esportsService.loginSencillo(request);

        assertEquals("Error", resultado);
    }

    @Test
    void listarSocios_retornaListaDeSocios() {
        UsuarioResponse usuario = new UsuarioResponse();
        usuario.setId(1L);
        usuario.setUsername("socio premium");
        usuario.setEmail("socio.premium@duocuc.cl");

        when(esportsClient.obtenerSocios()).thenReturn(List.of(usuario));

        ApiResponse<List<UsuarioResponse>> respuesta = esportsService.listarSocios();

        assertNotNull(respuesta);
        assertEquals(1, respuesta.getData().size());
        assertEquals("socio premium", respuesta.getData().get(0).getUsername());

        verify(esportsClient).obtenerSocios();
    }

    @Test
    void listarPlanes_retornaListaDePlanes() {
        PlanResponse plan = new PlanResponse();
        plan.setId(1L);
        plan.setNombre("Plan Pro - Valorant");

        when(esportsClient.obtenerPlanes()).thenReturn(List.of(plan));

        ApiResponse<List<PlanResponse>> respuesta = esportsService.listarPlanes();

        assertNotNull(respuesta);
        assertEquals(1, respuesta.getData().size());
        assertEquals("Plan Pro - Valorant", respuesta.getData().get(0).getNombre());

        verify(esportsClient).obtenerPlanes();
    }
}