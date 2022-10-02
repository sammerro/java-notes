package structural_test.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{

    Folder parent;
    String name;
    boolean deleted = false;

    public Folder(String name) {
        this.name = name;
    }

    List<IFile> files = new ArrayList<>();

    public void addFile(IFile file) {
        files.add(file);
    }


    @Override
    public void moveFile(Folder parent) {
        parent.addFile(this);
    }

    @Override
    public void renameFile(String name) {

    }
}
