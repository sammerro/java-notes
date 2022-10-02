package behavioral.chain_of_responsibility_exc;

public class DataReader {

    HandlerOfFile handlerOfFile;


    public DataReader(HandlerOfFile handlerOfFile) {
        this.handlerOfFile = handlerOfFile;
    }

    public void read(String fileName) {
        boolean handle = handlerOfFile.handle(fileName);
        if (handle) {
            System.out.println("File was handled.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
    }
}
