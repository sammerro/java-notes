package behavioral_test.visitor;

public class Paragraph implements HTMLNode {

    @Override
    public void accept(HtmlNodeOperation htmlNodeOperation) {
        htmlNodeOperation.perform(this);
    }
}
