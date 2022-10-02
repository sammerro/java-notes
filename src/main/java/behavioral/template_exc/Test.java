package behavioral.template_exc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        MusicWindow musicWindow = new MusicWindow();


        System.out.println("START");
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(()->{});

        musicWindow.close();

        System.out.println("KONIEC");
    }
}
