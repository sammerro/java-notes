package behavioral_test.strategy;

public class SelfieModeImage implements ImageStrategy<Phone>{

    @Override
    public void perform(Phone phone) {
        System.out.println("Image using selfie mode...");
    }
}
