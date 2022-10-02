package behavioral.chain_of_responsibility;

public interface RequestHandler {

    // return null if success
    // return error message if failed
    public String handle(HttpRequest request);

}
