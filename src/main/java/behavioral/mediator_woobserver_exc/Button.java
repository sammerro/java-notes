package behavioral.mediator_woobserver_exc;

public class Button extends Colleage {
    private boolean isEnabled;

    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        changed(this);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
