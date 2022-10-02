package behavioral.not_related;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        for (int i = 0; i < 100; i++) {
            final int k = i;
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println("Thread --- " + Integer.toString(k));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            executorService.submit(thread);
        }
    }
}
