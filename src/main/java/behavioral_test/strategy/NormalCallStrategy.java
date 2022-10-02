package behavioral_test.strategy;

public class NormalCallStrategy implements CallStrategy<Phone>{

    @Override
    public void perform(Phone phone) {
        System.out.println("Calling via GSM");
    }
}
