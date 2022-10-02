package behavioral.visitor;

public class NormalizeOperation implements  Operation{

    @Override
    public void perform(FactSegment segment) {
        System.out.println("Normalized fact segment");
    }

    @Override
    public void perform(FormatSegment segment) {
        System.out.println("Normalized format segment");
    }
}
