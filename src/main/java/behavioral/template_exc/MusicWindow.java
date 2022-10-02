package behavioral.template_exc;

public class MusicWindow extends Window{

    @Override
    protected void beforeClose() {
        System.out.println("Notify speakers and other devices..");
        System.out.println("Stop playing music...");
        System.out.println("Clear the buffer...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Show message about successfull window closing...");
    }
}
