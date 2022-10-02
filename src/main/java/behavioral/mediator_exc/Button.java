package behavioral.mediator_exc;

public class Button extends UIControl {
    private boolean isEnabled;

    public void click() {
        notifyObservers();
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
