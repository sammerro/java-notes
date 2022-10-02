package behavioral.command_exc;

public class SetContrastCommand implements UndoableCommand{
    private VideoEditor videoEditor;
    private Float previousContrast;
    private Float contrastToSet;

    public SetContrastCommand(VideoEditor videoEditor, float contrastToSet) {
        this.videoEditor = videoEditor;
        this.previousContrast = this.videoEditor.getContrast();
        this.contrastToSet = contrastToSet;
    }

    @Override
    public void execute() {
        this.videoEditor.setContrast(this.contrastToSet);
    }

    @Override
    public void undo() {
        this.videoEditor.setContrast(this.previousContrast);
    }
}
