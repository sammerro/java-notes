package behavioral.mediator_woobserver_exc;

public class TextBox extends Colleage {
    private String content;

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        changed(this);
    }
}
