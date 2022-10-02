package behavioral.memento_mine;

public class Tests {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.undo();

        editor.setContent("Hej");
        editor.undo();

        editor.setContent("Now wiadomosc.");
        editor.setContent("Now wiadomosc 2");
        editor.setContent("Now wiadomosc 3");
        editor.setContent("Now wiadomosc 4");

        editor.undo();
        editor.undo();

        assert (editor.getContent().equals("Now wiadomosc 2"));

        editor.undo();
        editor.undo();
        editor.undo();

        System.out.println("KONIEC");
    }
}
