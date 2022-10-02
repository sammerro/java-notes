package behavioral_test.mediator;

public class TextField extends UiControl{

    private String value = "";


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        this.changed();
    }

    @Override
    protected void changed() {
        this.parent.elementChanged(this);
    }
}
