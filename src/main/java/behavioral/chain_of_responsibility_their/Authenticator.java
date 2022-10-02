package behavioral.chain_of_responsibility_their;

import java.util.Objects;

public class Authenticator extends RequestHandler {

    public Authenticator(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    protected String handlePrivate(HttpRequest request) {
        String password = request.getPassword();
        String username = request.getUsername();
        boolean isValid = Objects.equals(username, "admin") && Objects.equals(password, "1234");
        return isValid ? null : "Authentication failed.";
    }
}
