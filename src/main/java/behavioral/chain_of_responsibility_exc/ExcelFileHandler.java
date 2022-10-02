package behavioral.chain_of_responsibility_exc;

public class ExcelFileHandler extends HandlerOfFile {

    public ExcelFileHandler(HandlerOfFile next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String file) {
        if (file.endsWith(".xlsx")) {
            System.out.println("Used xlsx file reader");
            return true;
        } else {
            return false;
        }
    }
}
