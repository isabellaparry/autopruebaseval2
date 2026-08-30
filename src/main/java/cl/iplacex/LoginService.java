package cl.iplacex;

public class LoginService {

    public boolean autenticar(String correo, String password) {

        if (correo.equals("usuario@test.cl") && password.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }
}