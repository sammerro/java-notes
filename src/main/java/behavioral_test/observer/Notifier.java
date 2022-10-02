package behavioral_test.observer;

public interface Notifier {

    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscribers();


}
