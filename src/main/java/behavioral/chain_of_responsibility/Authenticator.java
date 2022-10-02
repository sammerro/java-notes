package behavioral.chain_of_responsibility;

import java.util.Objects;

public class Authenticator implements RequestHandler{
    public String handle(HttpRequest request) {
        String password = request.getPassword();
        String username = request.getUsername();
        boolean isValid = Objects.equals(username, "admin") && Objects.equals(password, "1234");
        return isValid ? null : "Authentication failed.";
    }

}
