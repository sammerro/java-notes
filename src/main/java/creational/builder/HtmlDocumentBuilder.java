package creational.builder;

import creational.builder.html.HtmlDocument;
import creational.builder.html.HtmlImage;
import creational.builder.html.HtmlParagraph;

public class HtmlDocumentBuilder implements ExportBuilder{

    @Override
    public String build(Document document) {
        HtmlDocument htmlDocument = new HtmlDocument();

        for (Element element: document.getElements()) {
            if (element instanceof Text) {
                var text = ((Text)element).getContent();
                htmlDocument.add(new HtmlParagraph(text));
            }
            else if (element instanceof Image) {
                var source = ((Image)element).getSource();
                htmlDocument.add(new HtmlImage(source));
            }
        }

        return document.toString();
    }
}
