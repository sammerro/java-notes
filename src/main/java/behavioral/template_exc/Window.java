package behavioral.template_exc;

public class Window {

    public final void close() {
        beforeClose();
        System.out.println("Removing the window from the screen");
        afterClose();
    }

    protected void beforeClose() {
    }

    protected void afterClose() {
    }


}
