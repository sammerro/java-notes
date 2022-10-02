package behavioral_test.command;

public class Game {
    int x = 0;
    int y = 0;
    int health = 100;
    int power = 100;
    public enum State {
        DEFENCE,
        ATTACK,
        MOVE
    }
    State state = State.MOVE;
    int speed = 0;
}
