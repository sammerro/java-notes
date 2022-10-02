package behavioral_test.chain_of_responsibility;

public class Throttler extends Middleware {

    public Throttler(Middleware next) {
        super(next);
    }

    @Override
    protected String doExecute(Request request) {
        System.out.println("Throttling...");
        return null;
    }
}
