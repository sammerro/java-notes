package behavioral_test.command;

public class AttackCommand implements UndoableCommand {

    @Override
    public void perform() {
        System.out.println("attack");
    }

    @Override
    public void undo() {
        System.out.println("can not undo attack");
    }
}
