package behavioral.chain_of_responsibility_exc;public class Test {

    public static void main(String[] args) {
        String file1 = "mnichl.xlsx";
        String file2 = "mnichl.numbers";
        String file3 = "mnichl.oij";
        String file4 = "mnichl.qbw";

        HandlerOfFile handlerOfFile = new ExcelFileHandler(new NumbersFileHandler( new QuickBookHandler(null)));

        DataReader dataReader = new DataReader(handlerOfFile);
        dataReader.read(file1);
        dataReader.read(file2);
        try {
            dataReader.read(file3);
        } catch(Exception e) {
            System.out.println(e);
        }
        dataReader.read(file4);
        System.out.println("KONIEC.");
    }
}
