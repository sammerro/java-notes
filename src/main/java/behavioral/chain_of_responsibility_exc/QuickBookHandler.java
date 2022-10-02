package behavioral.chain_of_responsibility_exc;

public class QuickBookHandler extends HandlerOfFile {

    public QuickBookHandler(HandlerOfFile next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String file) {
        if (file.endsWith(".qbw")) {
            System.out.println("Used quick book.");
            return true;
        } else {
            return false;
        }
    }
}
