package cl.iplacex.steps;

import cl.iplacex.LoginService;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private LoginService loginService;
    private boolean resultado;

    @Dado("que existe un usuario registrado")
    public void existeUsuarioRegistrado() {

        loginService = new LoginService();
    }

    @Cuando("ingresa el correo {string} y la contraseña {string}")
    public void ingresarCredenciales(String correo, String password) {

        resultado = loginService.autenticar(correo, password);
    }

    @Entonces("el acceso debe ser {string}")
    public void validarAcceso(String resultadoEsperado) {

        boolean esperado = resultadoEsperado.equals("permitido");

        assertEquals(esperado, resultado);
    }
}