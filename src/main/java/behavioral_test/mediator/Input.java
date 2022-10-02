package behavioral_test.mediator;

public class Input extends UiControl{

    private String value = "";
    private boolean isDisabled = false;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.changed();
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    @Override
    public void changed() {
        parent.elementChanged(this);
    }
}
