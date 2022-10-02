package structural_test.composite;

public class NormalFile implements IFile{

    String name;

    @Override
    public void moveFile(Folder file) {
        file.addFile(this);
    }

    @Override
    public void renameFile(String name) {
        this.name = name;
    }
}
