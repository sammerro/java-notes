package behavioral_test.iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        MichalList<String> stringMichalList = new MichalList<>();

        stringMichalList.add("numer1");
        stringMichalList.add("numer2");
        stringMichalList.add("numer3");
        stringMichalList.add("numer4");

        System.out.println("demo");

        stringMichalList.iterate(System.out::println);
    }
}
