package behavioral_test.memento;

public interface State<T> {
    public void restore(T t);
}
