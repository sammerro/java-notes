package behavioral.command_exc;

public interface UndoableCommand extends Command {
    public void undo();
}
