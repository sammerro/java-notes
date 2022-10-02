package behavioral.visitor;

public class AddReverbOperation implements  Operation{

    @Override
    public void perform(FactSegment segment) {
        System.out.println("Added reverb to fact segment.");
    }

    @Override
    public void perform(FormatSegment segment) {
        System.out.println("Added reverb to fact format segment.");

    }
}
