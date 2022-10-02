package behavioral.chain_of_responsibility;

import java.util.List;

public class RequestHandlerChain implements RequestHandler{
    List<RequestHandler> handlers;

    public RequestHandlerChain(List<RequestHandler> handlers) {
        this.handlers = handlers;
    }

    public void add(RequestHandler requestHandler) {
        handlers.add(requestHandler);
    }

    public String handle(HttpRequest request) {
        for (RequestHandler handler : handlers) {
            String handle = handler.handle(request);
            if (handle != null) return handle;
        }
        return null;
    }

}
