package behavioral_test.strategy;

public class NormalImageStrategy implements ImageStrategy<Phone> {

    @Override
    public void perform(Phone phone) {
        System.out.println("Image normal");
    }
}
