package behavioral.strategy_exc;

public class DSAAlg implements EncryptionAlgorithm{
    @Override
    public String encrypt(String input) {
        System.out.println("Encrypting with DSA");
        return "DSA Encrypted - " + input;
    }
}
