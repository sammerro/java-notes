package behavioral_test.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        Node button = new Button();
        Node input = new Input();
        Paragraph paragraph = new Paragraph();

        // good
        button.accept(new HighlightOperation());
        input.accept(new StrongOperation());
        input.accept(new HighlightOperation());

        // bad - poylmorphism won't work, we take Node implementation

        HighlightOperation highlightOperation = new HighlightOperation();
        highlightOperation.perform(input);
        highlightOperation.perform(button);
        // here will work cause it does cause defined as Paragraph class
        highlightOperation.perform(paragraph);
    }
}
