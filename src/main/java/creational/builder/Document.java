package creational.builder;


import creational.builder.html.HtmlDocument;
import creational.builder.html.HtmlImage;
import creational.builder.html.HtmlParagraph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public List<Element> getElements() {
        return this.elements;
    };


    public void export(ExportFormat format, String fileName) throws IOException {
        String content = format.getExportBuilder().build(this);

        var writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}
