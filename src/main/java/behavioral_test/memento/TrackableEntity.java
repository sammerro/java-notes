package behavioral_test.memento;

public interface TrackableEntity<State> {

    public void restore(State state);
    public State save();
    
}
