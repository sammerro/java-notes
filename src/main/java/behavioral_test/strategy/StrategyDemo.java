package behavioral_test.strategy;

public class StrategyDemo {


    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.makeImage();

        phone.setCallStrategy(new WhatsappCallStrategy());
        phone.call();
        phone.makeImage();
        phone.setImageStrategy(new SelfieModeImage());
        phone.call();
        phone.makeImage();



    }
}
