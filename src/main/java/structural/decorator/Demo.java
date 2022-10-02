package structural.decorator;

public class Demo {
    public static void show() {
        var editor = new Editor();
        editor.openProject("...");


    }

    public static void main(String[] args) {
        System.out.println("START");
        show();
    }
}
