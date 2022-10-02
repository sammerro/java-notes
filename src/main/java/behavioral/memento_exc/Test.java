package behavioral.memento_exc;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start");

        Document document = new Document();
        DocumentHistory documentHistory = new DocumentHistory();
        document.setContent("content");
        documentHistory.push(document.createState());
        document.setFontName("namme");
        documentHistory.push(document.createState());
        document.setFontSize(34);
        documentHistory.push(document.createState());

        document.setContent("asdfasdf|");
        DocumentState pop = documentHistory.pop();
        document.restoreState(pop);
        DocumentState pop2 = documentHistory.pop();
        document.restoreState(pop2);
        DocumentState pop3 = documentHistory.pop();
        document.restoreState(pop3);
        DocumentState pop4 = documentHistory.pop();
        document.restoreState(pop4);

    }
}
