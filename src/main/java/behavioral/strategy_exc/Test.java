package behavioral.strategy_exc;

public class Test {

    public static void main(String[] args) {
        System.out.println("START.");
        ChatClient chatClient = new ChatClient(new DSAAlg());
        chatClient.send("Michal jest fajny!");
        chatClient.send("Michal jest przystojny!");
        chatClient.send("Michal jest bystry!");

        System.out.println("KONIEC.");
    }
}
