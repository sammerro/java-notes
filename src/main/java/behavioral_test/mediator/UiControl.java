package behavioral_test.mediator;

public abstract class UiControl {
    protected Form parent;

    public void setParent(Form form) {
        parent = form;
    };

    protected abstract void changed();
}
