package behavioral.iterator_mine;

public class Test {

    public static void main(String[] args) {
        BrowsingHistory bh = new BrowsingHistory();
        bh.push("a");
        bh.push("b");
        bh.push("c");
        bh.push("d");
        bh.push("e");

        for (String s : bh) {
            System.out.println(s);
        }
    }
}
