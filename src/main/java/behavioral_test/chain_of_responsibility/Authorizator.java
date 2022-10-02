package behavioral_test.chain_of_responsibility;

import java.util.Map;

public class Authorizator extends Middleware{

    public Authorizator(Middleware next) {
        super(next);
    }

    @Override
    protected String doExecute(Request request) {
        Map<String, String> headers = request.headers();
        return headers.containsKey("Authorization") ? null : "Unauthorized!";
    }
}
