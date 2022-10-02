package behavioral_test.mediator;

public class DemoMediator {

    // new Form();
    // ->
    // changed(ConcreteClass class)


    // new Button();
    // new TextField();
    // new Checkbox();
    // new Input();

    // form.attach(button)
    // form.attach(checkbox)
    // form.attach(input)

    // Ui control->
    //
    // setParent
    // notify


    public static void main(String[] args) {
        Form form = new Form();
        Button button = new Button();
        Input input = new Input();
        TextField textField = new TextField();

        form.attach(button);
        form.attach(input);
        form.attach(textField);

        input.setValue("Michal");
        button.click();
        button.click();
        textField.setValue("xxxx");
        input.setValue("HEJ");

    }

}
