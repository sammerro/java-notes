package behavioral_test.visitor;

public class StrongOperation implements HtmlNodeOperation {

    @Override
    public void perform(Node node) {
        System.out.println("Performing strong on Node");
    }

    @Override
    public void perform(Button button) {
        System.out.println("Make text of button strong and widen it.");
    }

    @Override
    public void perform(Paragraph paragraph) {
        System.out.println("Make text stronger.");
    }

    @Override
    public void perform(Input input) {
        System.out.println("Make text stronger on the input.");
    }
}
