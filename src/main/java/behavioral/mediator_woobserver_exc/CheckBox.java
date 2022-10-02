package behavioral.mediator_woobserver_exc;

public class CheckBox extends Colleage {
    private boolean isChecked;

    public CheckBox(Mediator mediator) {
        super(mediator);
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        changed(this);
    }
}
