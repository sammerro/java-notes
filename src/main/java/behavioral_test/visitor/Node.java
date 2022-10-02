package behavioral_test.visitor;

public class Node implements HTMLNode{
    @Override
    public void accept(HtmlNodeOperation htmlNodeOperation) {
        htmlNodeOperation.perform(this);
    }
}
