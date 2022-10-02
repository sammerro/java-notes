package behavioral_test.chain_of_responsibility;

public abstract class Middleware {
    Middleware next;

    public Middleware(Middleware next) {
        this.next = next;
    }

    public String execute(Request request) {
        String errorMessage = doExecute(request);
        if (errorMessage == null) {
            return next == null ? null : next.doExecute(request);
        }
        return errorMessage;
    };

    abstract protected String doExecute(Request request);
}
