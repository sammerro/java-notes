package behavioral_test.visitor;

public class HighlightOperation implements HtmlNodeOperation {

    @Override
    public void perform(Node node) {
        System.out.println("performing hightlight on node");
    }

    @Override
    public void perform(Button button) {
        System.out.println("change only border of the button");
    }

    @Override
    public void perform(Paragraph paragraph) {
        System.out.println("underline paragraph");
    }

    @Override
    public void perform(Input input) {
        System.out.println("change border and underline input");
    }
}
