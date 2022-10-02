package behavioral.visitor;

public class NoiceReduceOperation implements Operation{

    @Override
    public void perform(FactSegment segment) {
        System.out.println("Noise reduction on Fact Segment performed...");
    }

    @Override
    public void perform(FormatSegment segment) {
        System.out.println("Noise reduction on Format Segment performed...");
    }
}
