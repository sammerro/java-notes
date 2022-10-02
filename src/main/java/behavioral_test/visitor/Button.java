package behavioral_test.visitor;

public class Button extends Node{

    @Override
    public void accept(HtmlNodeOperation htmlNodeOperation) {
        htmlNodeOperation.perform(this);
    }
}
