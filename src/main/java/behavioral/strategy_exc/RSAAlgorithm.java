package behavioral.strategy_exc;

public class RSAAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String input) {
        System.out.println("Encrypting with RSA...");
        return "RSA Encrypted string " + input;
    }
}
