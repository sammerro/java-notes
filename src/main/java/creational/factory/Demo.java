package creational.factory;

public class Demo {
    public static void show() {
        var scheduler = new ArabicScheduler();
        scheduler.schedule(new Event());
    }

    public static void main(String[] args) {
        System.out.println("Show!");
        show();
        System.out.println("IT");
    }
}
