package behavioral.observer_exc;

public class Stock implements Observable {
    private String symbol;
    private float price;
    private Observable observationHandler;

    @Override
    public void attach(Observer observer) {
        observationHandler.attach(observer);
    }

    @Override
    public void detach(Observer observer) {
        observationHandler.detach(observer);
    }

    @Override
    public void notifyObservers() {
        observationHandler.notifyObservers();
    }

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
        this.observationHandler = new ConcreteObservable();
    }




    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();//pull type
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
