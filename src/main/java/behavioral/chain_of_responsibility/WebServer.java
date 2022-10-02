package behavioral.chain_of_responsibility;

public class WebServer {

    RequestHandler requestHandler;

    public WebServer(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public String handleRequest(HttpRequest request) {
        return requestHandler.handle(request);
    }
}
