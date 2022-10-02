package behavioral_test.command;

public class MoveForwardCommand implements UndoableCommand {
    Game game;
    boolean performed = false;

    public MoveForwardCommand(Game game) {
        this.game = game;
    }

    @Override
    public void perform() {
        if (!performed) {
            game.y++;
            this.performed = true;
        } else {
            System.out.println("performing not availabale");
        }
    }

    @Override
    public void undo() {
        if (performed) {
            game.y--;
            performed = false;
        } else {
            System.out.println("undo not availabale");
        }
    }
}
