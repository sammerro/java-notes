package behavioral.command_exc;

public class RemoveTextCommand implements UndoableCommand{
    private String previousText;
    private VideoEditor videoEditor;

    public RemoveTextCommand(VideoEditor videoEditor) {
        this.videoEditor = videoEditor;
        this.previousText = this.videoEditor.getText();
    }

    @Override
    public void execute() {
        this.videoEditor.removeText();
    }

    @Override
    public void undo() {
        this.videoEditor.setText(this.previousText);
    }
}
