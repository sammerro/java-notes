package behavioral.observer_exc;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("START");
        StockListView stockListView = new StockListView();
        StatusBar statusBar = new StatusBar();
        ArrayList<Stock> stocks = new ArrayList<>();

        Stock btc = new Stock("BTC", 99);
        stocks.add(btc);
        statusBar.addStock(btc);
        statusBar.addStock(btc);
        btc.attach(statusBar);
        btc.attach(stockListView);
        Stock msft = new Stock("MSFT", 123);
        stocks.add(msft);
        msft.attach(statusBar);
        msft.attach(stockListView);
        statusBar.addStock(msft);
        statusBar.addStock(msft);
        Stock amz = new Stock("AMZ", 43);
        stocks.add(amz);
        amz.attach(statusBar);
        amz.attach(stockListView);
        statusBar.addStock(amz);
        statusBar.addStock(amz);
        Stock netf = new Stock("NETF", 23);
        netf.attach(statusBar);
        netf.attach(stockListView);
        stocks.add(netf);
        statusBar.addStock(netf);
        statusBar.addStock(netf);

        amz.setPrice(654);
        System.out.println("-------------------------------------------");
        Thread.sleep(1000);
        netf.setPrice(34);
        System.out.println("-------------------------------------------");
        Thread.sleep(1000);
        btc.setPrice(98);
        System.out.println("-------------------------------------------");
        Thread.sleep(1000);
        System.out.println("KONIEC");

    }
}
