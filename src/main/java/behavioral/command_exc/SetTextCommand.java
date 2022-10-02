package behavioral.command_exc;

public class SetTextCommand implements UndoableCommand{
    private String previousText;
    private VideoEditor videoEditor;
    private String textToSet;

    public SetTextCommand(VideoEditor videoEditor, String textToSet) {
        this.videoEditor = videoEditor;
        this.previousText = this.videoEditor.getText();
        this.textToSet = textToSet;
    }

    @Override
    public void execute() {
        this.videoEditor.setText(this.textToSet);
    }

    @Override
    public void undo() {
        this.videoEditor.setText(this.previousText);
    }
}
