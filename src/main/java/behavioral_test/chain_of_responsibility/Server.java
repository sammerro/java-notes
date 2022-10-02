package behavioral_test.chain_of_responsibility;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

public class Server {

    Middleware middleware;

    public Middleware getMiddleware() {
        return middleware;
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean sendRequest(Request request) {
        String s = validateRequest(request);
        if (s == null) {
            // send ...
            return true;
        }
        System.out.println("COULD NOT SEND. ERROR: \n" + s);
        return false;
    }

    private String validateRequest(Request request) {
        return middleware.execute(request);
    }


    public static void main(String[] args) {
        Server server = new Server();
        Middleware serverMiddleware = new Authorizator(new Throttler(null));
        server.setMiddleware(serverMiddleware);

        Request request = new Request() {

            @Override
            public void send() {
                System.out.println("SENDING REQUEST HURRAY!!!!");
            }

            @Override
            public Map<String, String> headers() {
                HashMap<String, String> map = new HashMap<>();
                map.put("Authorizzation", "Bearer 53uetpowietlkjet0u");
                return map;
            }

        };

        boolean b = server.sendRequest(request);
        if (b) {
            System.out.println("SUCESS, request was sent!");
        } else {
            System.out.println("FAILURE, request was not sent..");
        }
    }

}
