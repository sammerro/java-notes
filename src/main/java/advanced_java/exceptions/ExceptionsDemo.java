package advanced_java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ExceptionsDemo {
    public static void show() {
        try (
                FileReader fileReader = new FileReader("File.txt");
                FileWriter writer =  new FileWriter("File.txt");
                ){
            int read = fileReader.read();
            System.out.println("File opened...");
            Date parse = new SimpleDateFormat().parse("");
        } catch (IOException | ParseException exception) {
            System.out.println("Could not read data.");
        }
//        catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }


    }
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase(Locale.ROOT));
    }


    public void addNumbers(int a , int b) throws MyAppException {
        if (a < 0 || b < 0) {
            MyAppException myAppException = new MyAppException();
            MyAppNumberException myAppNumberException = new MyAppNumberException();

            myAppException.initCause(myAppNumberException);

            throw myAppException;
        }
    }
}
