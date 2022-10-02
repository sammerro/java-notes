package behavioral_test.mediator;

public class Button extends UiControl{

    private boolean isDisabled = false;

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }
    public void click() {
        this.changed();
    }

    @Override
    public void changed() {
        this.parent.elementChanged(this);
    }
}
