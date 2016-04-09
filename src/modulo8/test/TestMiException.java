
package modulo8.test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto Olveras
 */
public class TestMiException {
    public static void main(String[] args) {
        String user = "roberdsto";
        String pass = "roberto";
        try {
            login(user,pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void login(String user, String pass) throws LoginInvalidUserExeption{
        if(!user.equals("roberto")){
            //return;
            throw new LoginInvalidUserExeption(user);
        }
        //if(pass eq passUser)
    }
            
}
