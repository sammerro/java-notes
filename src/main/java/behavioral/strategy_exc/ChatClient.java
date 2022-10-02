package behavioral.strategy_exc;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        String encrypt = encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
        System.out.println(encrypt);
    }
}
