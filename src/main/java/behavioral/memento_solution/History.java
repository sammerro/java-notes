package behavioral.memento_solution;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState) {
        states.add(editorState);
    }

    public EditorState pop() {
        if (states.isEmpty()) {
            return null;
        }
        int idx = states.size() - 1;
        EditorState editorState = states.get(idx);
        states.remove(idx);

        return editorState;
    }
}
