package behavioral_test.command;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<UndoableCommand> commandList = new ArrayList<>();

    public void add (UndoableCommand command) {
        commandList.add(command);
    }

    public UndoableCommand pop() {
        if (commandList.isEmpty()) return null;
        return commandList.remove(commandList.size() - 1);
    }
}
