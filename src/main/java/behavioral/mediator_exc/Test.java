package behavioral.mediator_exc;

public class Test {



    public static void main(String[] args) {

        Button button = new Button();
        CheckBox checkBox = new CheckBox();
        TextBox textBox = new TextBox();

        Observer updateButton = () -> {
            boolean allFilled = checkBox.isChecked() && textBox.getContent() != null && !textBox.getContent().isEmpty();
            button.setEnabled(allFilled);
        };

        Observer handleButtonClick = () -> {
            boolean allFilled = checkBox.isChecked() && textBox.getContent() != null && !textBox.getContent().isEmpty();
            button.setEnabled(allFilled);
        };
        button.addEventHandler(() -> {
            if (button.isEnabled()) {
                System.out.println("Subscribed with values: \n\tcontent: " + textBox.getContent() + "\n\tcheckbox: " + (checkBox.isChecked() ? "check" : "unchecked"));
            } else {
                System.out.println("button is disabled");
            }
        });
        textBox.addEventHandler(updateButton);
        checkBox.addEventHandler(updateButton);

        button.click();
        checkBox.setChecked(true);
        textBox.setContent("This is my text");
        button.click();
    }
}
