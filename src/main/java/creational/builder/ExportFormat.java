package creational.builder;

public enum ExportFormat {

    HTML(new HtmlDocumentBuilder()),
    TEXT(new TextDocumentBuilder()),
    PDF(new HtmlDocumentBuilder());

    private final ExportBuilder exportBuilder;

    ExportFormat(ExportBuilder exportBuilder) {
        this.exportBuilder = exportBuilder;
    }

    public ExportBuilder getExportBuilder() {
        return exportBuilder;
    }
}
