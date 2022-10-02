package behavioral.strategy_mine;

public class JPGCompress implements ImageCompressing {

    @Override
    public String compress(String image) {
        System.out.println("Compressing using JPG...");
        return image;
    }
}
