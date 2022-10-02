package behavioral.iterator_mine;

import java.util.Iterator;

public class BrowsingHistory implements Iterable<String> {

    private String[] urls = new String[10];

    private int lastIdx = -1;

    public void push(String url) {
        if (lastIdx > 9) {
            return;
        }
        urls[++lastIdx] = url;
    }

    public String pop() {
        if (lastIdx == -1) return null;
        return urls[lastIdx--];
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < lastIdx;
            }

            @Override
            public String next() {
                return urls[i++];
            }
        };
    }
}
