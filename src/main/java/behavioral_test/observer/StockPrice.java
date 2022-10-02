package behavioral_test.observer;

import java.util.ArrayList;
import java.util.List;

public class StockPrice implements Notifier {
    private double price = 0;

    List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
       subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.reactToChange();
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifySubscribers();
    }
}
