package behavioral.chain_of_responsibility_their;

public class Compressor extends RequestHandler {

    public Compressor(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected String handlePrivate(HttpRequest request) {
        System.out.println("Compressed.");
        return null;
    }
}
