
package modulo8.test;

public class LoginInvalidUserExeption extends Exception {
    public LoginInvalidUserExeption(String user) {
        super("El usuario: "+user+" es incorrecto");
    }    
}
