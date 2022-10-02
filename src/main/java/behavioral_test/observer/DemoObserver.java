package behavioral_test.observer;

public class DemoObserver {

    public static void main(String[] args) throws InterruptedException {
        StockPrice stockPrice = new StockPrice();
        Plot plot = new Plot(stockPrice);
        Arrow arrow = new Arrow(stockPrice);
        stockPrice.addSubscriber(plot);
        stockPrice.addSubscriber(arrow);
        System.out.println("START");
        stockPrice.setPrice(10.0);
        Thread.sleep(100);
        stockPrice.setPrice(30.0);
        Thread.sleep(100);
        stockPrice.setPrice(200.0);
        Thread.sleep(100);
        stockPrice.setPrice(100.0);
        Thread.sleep(100);
        stockPrice.setPrice(700.0);
        System.out.println("START");
    }
}
