package behavioral.command_exc;

public interface VideoController {
    public void setText(String text);
    public void removeText();

    public void setContrast(float contrast);

    // could be extracted to a different interface
    public void undo();

}
