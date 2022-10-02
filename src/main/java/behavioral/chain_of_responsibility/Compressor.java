package behavioral.chain_of_responsibility;

public class Compressor implements RequestHandler {

    public String handle(HttpRequest httpRequest) {
        System.out.println("Compressed.");
        return null;
    }
}
