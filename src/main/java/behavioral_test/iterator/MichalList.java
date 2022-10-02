package behavioral_test.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MichalList<T> implements MichalIterable<T>{

    private List<T> list = new ArrayList<>();


    private class MichalListIterator implements MichalIterator<T> {
        int current = -1;

        @Override
        public T next() {
            if (hasNext()) {
                return list.get(++current);
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return current < list.size() - 1;
        }
    }

    @Override
    public MichalIterator<T> createIterator() {
        return new MichalListIterator();
    }

    @Override
    public void iterate(Consumer<T> consumer) {
        MichalIterator<T> iterator = createIterator();
        while (iterator.hasNext()) {
            T next = iterator.next();
            consumer.accept(next);
        }
    }

    public void add(T t) {
        list.add(t);
    }
}
