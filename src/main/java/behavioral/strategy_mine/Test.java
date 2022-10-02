package behavioral.strategy_mine;

public class Test {

    public static void main(String[] args) {
        System.out.println("START.");
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("michal.zdjecie", new JPGCompress(), new BWFilter());
        imageStorage.store("basia2.zdjecie", new PNGCompress(), new BWFilter());
        imageStorage.store("daisy.zdjecie", new JPGCompress(), new ContrastFilter());

        System.out.println("KONIEC.");
    }
}
