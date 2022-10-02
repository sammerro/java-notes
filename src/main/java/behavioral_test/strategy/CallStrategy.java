package behavioral_test.strategy;

public interface CallStrategy<T> {
    public void perform(T t);
}
