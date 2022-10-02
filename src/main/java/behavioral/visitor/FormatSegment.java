package behavioral.visitor;

public class FormatSegment implements Segment {

    @Override
    public void execute(Operation operation) {
        operation.perform(this);
    }

}
