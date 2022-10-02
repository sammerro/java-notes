package behavioral.visitor;

public class FactSegment implements Segment {

    @Override
    public void execute(Operation operation) {
        operation.perform(this);
    }
}
