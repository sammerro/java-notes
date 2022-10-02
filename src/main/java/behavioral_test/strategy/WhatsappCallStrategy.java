package behavioral_test.strategy;

public class WhatsappCallStrategy implements CallStrategy<Phone> {

    @Override
    public void perform(Phone phone) {
        System.out.println("Calling via whatsapp...");
    }
}
