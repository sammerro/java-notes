package behavioral.chain_of_responsibility_their;

public class WebServer {

    RequestHandler requestHandler;

    public WebServer(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public String handleRequest(HttpRequest request) {
        String handle = requestHandler.handle(request);
        if (handle == null) {
            return "SUCESS: 200";
        } else {
            return "ERROR: " + handle;
        }
    }
}
