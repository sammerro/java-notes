package behavioral.command_exc;

import java.util.Objects;

public class Controller implements VideoController {
    VideoEditor videoEditor;
    History history;

    public Controller(VideoEditor videoEditor, History history) {
        Objects.requireNonNull(videoEditor);
        Objects.requireNonNull(history);

        this.videoEditor = videoEditor;
        this.history = history;
    }



    @Override
    public void setText(String text) {
        SetTextCommand setTextCommand = new SetTextCommand(videoEditor, text);
        history.push(setTextCommand);
        setTextCommand.execute();
    }

    @Override
    public void removeText() {
        UndoableCommand removeTextCommand = new RemoveTextCommand(videoEditor);
        history.push(removeTextCommand);
        removeTextCommand.execute();
    }

    @Override
    public void setContrast(float contrast) {
        UndoableCommand setContrastCommand = new SetContrastCommand(videoEditor, contrast);
        history.push(setContrastCommand);
        setContrastCommand.execute();
    }

    @Override
    public void undo() {
        if (!this.history.isEmpty()) {
            this.history.pop().undo();
        } else {
            System.out.println("No commands were performed.");
        }
    }

    public String showState() {
        return videoEditor.toString();
    }
}
