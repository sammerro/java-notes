package behavioral.command;

public class Test {

    public static void main(String[] args) {
        Button button = new Button();
        button.addClickListener(new Command() {
            @Override
            public void perform() {
                System.out.println("Now we are making the close window command. Bye!!!");
            }
        });

        button.click();
    }
}
