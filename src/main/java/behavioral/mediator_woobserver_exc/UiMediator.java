package behavioral.mediator_woobserver_exc;

public class UiMediator implements Mediator {
    Button button;
    CheckBox checkBox;
    TextBox textBox;


    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public TextBox getTextBox() {
        return textBox;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }

    @Override
    public void wasUpdated(Colleage colleage) {

        if (colleage == button) {
            if (button.isEnabled()) {
                System.out.println("Subscribed with values: \n\tcontent: " + textBox.getContent() + "\n\tcheckbox: " + (checkBox.isChecked() ? "check" : "unchecked"));
            } else {
                System.out.println("button is disabled");
            }
        } else if (colleage == checkBox || colleage == textBox) {
            boolean isFilled = getCheckBox().isChecked() && getTextBox().getContent() != null && !getTextBox().getContent().isEmpty();
            button.setEnabled(isFilled);
        }
    }
}
