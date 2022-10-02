package behavioral_test.chain_of_responsibility;

import java.util.Map;

public interface Request {

    public void send();

    public Map<String, String> headers();
}
