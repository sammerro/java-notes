package behavioral.chain_of_responsibility_their;

public abstract class RequestHandler {

    RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // return null if success
    // return error message if failed
    protected abstract String handlePrivate(HttpRequest request);

    private RequestHandler next() {
        return nextHandler;
    }

    public String handle(HttpRequest request) {
        String s = handlePrivate(request);
        if (s != null) return s;

        RequestHandler next = next();
        return next == null ? null : next.handle(request);
    }

}
