package behavioral.chain_of_responsibility_their;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        HttpRequest httpRequest1 = new HttpRequest("michal", "asdf");
        HttpRequest httpRequest2 = new HttpRequest("admin", "1234");

        List<RequestHandler> list = new ArrayList<>();
        RequestHandler ulitmateHandler = new Authenticator(new Logger(new Compressor(null)));


        WebServer webServer = new WebServer(ulitmateHandler);
        System.out.println(webServer.handleRequest(httpRequest1));
        System.out.println(webServer.handleRequest(httpRequest2));


    }
}
