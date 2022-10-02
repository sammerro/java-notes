package behavioral.chain_of_responsibility;

public class Logger implements RequestHandler {
    public String handle(HttpRequest request) {
        System.out.println("Logged.");
        return null;
    }
}
