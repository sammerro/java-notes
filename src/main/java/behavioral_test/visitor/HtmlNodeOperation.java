package behavioral_test.visitor;

public interface HtmlNodeOperation {
    public void perform(Button button);
    public void perform(Paragraph paragraph);
    public void perform(Input input);

    public void perform(Node node);
}
