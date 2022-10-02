package behavioral.mediator_woobserver_exc;

public class Test {



    public static void main(String[] args) {

        UiMediator mediator = new UiMediator();

        Button button = new Button(mediator);
        CheckBox checkBox = new CheckBox(mediator);
        TextBox textBox = new TextBox(mediator);

        mediator.setButton(button);
        mediator.setCheckBox(checkBox);
        mediator.setTextBox(textBox);

        button.click();
        checkBox.setChecked(true);
        textBox.setContent("This is my text");

        button.click();
    }
}
