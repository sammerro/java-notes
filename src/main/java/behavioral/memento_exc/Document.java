package behavioral.memento_exc;

public class Document {
    private String content;
    private int fonSize = 12;
    private String fontName = "Tacoma";



    public DocumentState createState() {
        DocumentState documentState = new DocumentState();
        documentState.setContent(this.content);
        documentState.setFonSize(this.fonSize);
        documentState.setFontName(this.fontName);
        return documentState;
    }

    public void restoreState(DocumentState documentState) {
        if (documentState == null) {
            return;
        }
        this.setContent(documentState.getContent());
        this.setFontSize(documentState.getFonSize());
        this.setFontName(documentState.getFontName());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFonSize() {
        return fonSize;
    }

    public void setFontSize(int fonSize) {
        this.fonSize = fonSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
}
