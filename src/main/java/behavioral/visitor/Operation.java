package behavioral.visitor;

public interface Operation {
    public void perform(FactSegment segment);
    public void perform(FormatSegment segment);
}
