package behavioral.memento_solution;

public class Editor {
    String content;

    public void restore(EditorState editorState) {
        if (editorState == null) {
            return;
        }
        this.content = editorState.getContent();
    }
    public EditorState createState() {
        EditorState editorState = new EditorState();
        editorState.setContent(this.content);
        return editorState;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
