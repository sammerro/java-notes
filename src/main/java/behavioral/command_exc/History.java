package behavioral.command_exc;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<UndoableCommand> listOfCommands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        listOfCommands.add(command);
    }

    public UndoableCommand pop() {
        return listOfCommands.removeLast();
    }

    public boolean isEmpty() {
        return listOfCommands.isEmpty();
    }
}
