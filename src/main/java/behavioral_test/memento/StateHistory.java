package behavioral_test.memento;

import java.util.Stack;

public class StateHistory<T> {

    private final Stack<State<T>> stack = new Stack<>();


    public void add(State<T> state) {
        stack.add(state);
    }

    public State<T> pop() {
        return stack.pop();
    }


}
