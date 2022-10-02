package behavioral_test.iterator;

import java.util.function.Consumer;

public interface MichalIterable<T> {

    public MichalIterator<T> createIterator();

    public void iterate(Consumer<T> consumer);

}
