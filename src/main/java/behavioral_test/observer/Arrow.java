package behavioral_test.observer;

public class Arrow implements Subscriber {

    private StockPrice dataSource;
    private Icon icon = Icon.GREEN_ARROW_UP;
    private double lastValue = .0;

    public Arrow(StockPrice dataSource) {
        this.dataSource = dataSource;
    }

    private enum Icon {
        RED_ARROW_DOWN,
        GREEN_ARROW_UP;
    }

    public void render() {
        if (icon == Icon.RED_ARROW_DOWN) {
            System.out.println("Down...");
        } else {
            System.out.println("Up...");
        }
    }

    @Override
    public void reactToChange() {
        double newValue = dataSource.getPrice();
        this.icon = lastValue < newValue ? Icon.GREEN_ARROW_UP : Icon.RED_ARROW_DOWN;
        lastValue = newValue;
        this.render();
    }
}
