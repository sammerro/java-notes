package behavioral.strategy_mine;

public class BWFilter implements ImageFilter {

    @Override
    public void process(String image) {
        System.out.println("Applying black and white filter....");
    }
}
