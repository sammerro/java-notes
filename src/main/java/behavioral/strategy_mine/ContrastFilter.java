package behavioral.strategy_mine;

public class ContrastFilter implements ImageFilter {
    @Override
    public void process(String image) {
        System.out.println("Applying Contrast    Filter ...");
    }
}
