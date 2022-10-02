package behavioral.memento_exc;

public class DocumentState {
    private String content;
    private int fonSize = 12;
    private String fontName = "Tacoma";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFonSize() {
        return fonSize;
    }

    public void setFonSize(int fonSize) {
        this.fonSize = fonSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
}
