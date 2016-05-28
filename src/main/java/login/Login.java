package login;

/**
 * Created by baohg on 5/28/16.
 */
public class Login {
    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("a") && password.equals("a")) {
            return true;
        }
        return false;
    }
}