package behavioral_test.strategy;

public class Phone {

    private ImageStrategy<Phone> imageStrategy;
    private CallStrategy callStrategy;

    public Phone(ImageStrategy imageStrategy, CallStrategy callStrategy) {
        this.imageStrategy = imageStrategy;
        this.callStrategy = callStrategy;
    }

    public Phone() {
        this.imageStrategy = new NormalImageStrategy();
        this.callStrategy = new NormalCallStrategy();
    }

    public void makeImage() {
        imageStrategy.perform(this);
    }

    public void call() {
        callStrategy.perform(this);
    }

    public void setImageStrategy(ImageStrategy<Phone> imageStrategy) {
        this.imageStrategy = imageStrategy;
    }

    public void setCallStrategy(CallStrategy callStrategy) {
        this.callStrategy = callStrategy;
    }
}
