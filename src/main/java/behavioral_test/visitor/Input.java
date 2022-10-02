package behavioral_test.visitor;

public class Input extends Node{

    @Override
    public void accept(HtmlNodeOperation htmlNodeOperation) {
        htmlNodeOperation.perform(this);
    }
}
