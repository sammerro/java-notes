package behavioral.strategy_mine;

public class PNGCompress implements ImageCompressing{

    @Override
    public String compress(String image) {
        System.out.println("Compressing using PNG...");
        return image;
    }
}
