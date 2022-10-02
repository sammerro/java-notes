package behavioral_test.template;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class FileLoader {

    public final void modifyFile(String fileName) {
        System.out.println("Loading the file into memory...");
        Path path = Paths.get(fileName);
        try {
            String input = Files.readString(path);
            String s = updateContent(input);
            Files.writeString(path, s);
        } catch (IOException e) {
            onError(e);
        }
        // loading the file into memory

        // saving
        System.out.println("Save new content");

        // closing all the vu
        System.out.println("Closing the buffer and all the connections...");
    }

    protected abstract String updateContent(String fileContent);

    protected abstract void onError(Exception e);
}
