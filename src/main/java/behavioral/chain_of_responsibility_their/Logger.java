package behavioral.chain_of_responsibility_their;

public class Logger extends RequestHandler {

    public Logger(RequestHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    protected String handlePrivate(HttpRequest request) {
        System.out.println("Logged.");
        return null;
    }
}
