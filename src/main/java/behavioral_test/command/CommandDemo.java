package behavioral_test.command;


public class CommandDemo {

    public static void main(String[] args) {
        Game game = new Game();
        History history = new History();
        UndoableCommand moveForwardCommand = new MoveForwardCommand(game);
        moveForwardCommand.perform();
        history.add(moveForwardCommand);
        history.pop().undo();

        UndoableCommand attackCommand = new AttackCommand();
        attackCommand.perform();
        history.add(attackCommand);
        history.pop().undo();
    }
}
