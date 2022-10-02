package behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        HttpRequest httpRequest1 = new HttpRequest("michal", "asdf");
        HttpRequest httpRequest2 = new HttpRequest("admin", "1234");

        List<RequestHandler> list = new ArrayList<>();
        list.add(new Authenticator());
        list.add(new Logger());
        list.add(new Compressor());


        RequestHandlerChain requestHandlerChain = new RequestHandlerChain(list);

        System.out.println("START");

        String handle = requestHandlerChain.handle(httpRequest1);
        if (handle == null ) {
            System.out.println("Success");
        } else {
            System.out.println("ERROR: " + handle);
        }
        String handle1 = requestHandlerChain.handle(httpRequest2);
        if (handle1 == null ) {
            System.out.println("Success");
        } else {
            System.out.println("ERROR: " + handle1);
        }

        System.out.println("KONIEC");

    }
}
