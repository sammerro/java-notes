package behavioral.command;

public class Button {

    private Command clickCommand;


    public void addClickListener(Command command) {
        clickCommand = command;
    }

    public void click() {
        System.out.println("Clicking...");
        clickCommand.perform();
    }
}
