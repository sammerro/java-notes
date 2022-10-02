package behavioral.chain_of_responsibility_exc;

public class NumbersFileHandler extends HandlerOfFile{

    public NumbersFileHandler(HandlerOfFile next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String file) {
        if (file.endsWith(".numbers")) {
            System.out.println("Used mac's Numbers.");
            return true;
        }
        return false;
    }
}
