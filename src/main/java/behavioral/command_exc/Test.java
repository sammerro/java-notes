package behavioral.command_exc;

public class Test {


    public static void main(String[] args) {
        System.out.println("START");

        VideoEditor videoEditor = new VideoEditor();
        History history = new History();
        Controller controller = new Controller(videoEditor, history);
        System.out.println(controller.showState());
        controller.setContrast(1f);
        System.out.println(controller.showState());
        controller.setContrast(0.7f);
        System.out.println(controller.showState());
        controller.setText("Michal");
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.setText("Hej hej hej");
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        controller.undo();
        System.out.println(controller.showState());
        System.out.println("KONIEC");
    }

}
