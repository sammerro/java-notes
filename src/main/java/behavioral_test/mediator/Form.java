package behavioral_test.mediator;

// Mediator
public class Form {
    Button button;
    TextField textField;
    Input input;

    public void attach(Button button) {
        this.button = button;
        this.button.setParent(this);
    }

    public void attach(TextField textField) {
        this.textField = textField;
        this.textField.setParent(this);
    }

    public void attach(Input input) {
        this.input = input;
        this.input.setParent(this);
    }


    public void elementChanged(Button button) {
        if (button.isDisabled()) {
            return;
        }
        if (!input.getValue().isEmpty()) {
            input.setValue("");
        }
    };

    public void elementChanged(Input input) {
        if (!input.getValue().isEmpty()) {
            button.setDisabled(false);
        }
        textField.setValue(input.getValue());
    }

    public void elementChanged(TextField textField) {
        System.out.println(textField.getValue());
    }
}
