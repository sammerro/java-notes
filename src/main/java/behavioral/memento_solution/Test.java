package behavioral.memento_solution;

public class Test {


    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("hej");
        history.push(editor.createState());
        editor.setContent("qaith");
        history.push(editor.createState());
        editor.setContent("etrt 3");
        history.push(editor.createState());
        editor.setContent("hej 4");

        // undo
        EditorState pop = history.pop();
        editor.restore(pop);
    }
}
