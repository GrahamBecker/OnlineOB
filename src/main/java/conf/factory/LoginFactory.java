package conf.factory;

import domain.Login;

/**
 * Created by Graham Becker on 2015/10/11.
 */
public class LoginFactory {

    public static Login createLogin(Long id, String userName, String password){
        Login login = new Login
                .Builder(id)
                .userName(userName)
                .password(password)
                .build();
        return login;
    }


}
