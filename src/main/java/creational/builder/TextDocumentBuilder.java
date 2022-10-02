package creational.builder;

public class TextDocumentBuilder implements ExportBuilder {

    @Override
    public String build(Document document) {
        var builder = new StringBuilder();

        for (Element element: document.getElements()) {
            if (element instanceof Text) {
                var text = ((Text)element).getContent();
                builder.append(text);
            }
        }

        return builder.toString();
    }
}
