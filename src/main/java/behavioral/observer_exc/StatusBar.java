package behavioral.observer_exc;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void update() {
        show();
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }
}
