package structural.flyweight;

public class Font {

    private final String fontFamily;
    private final int fontSize;
    private final boolean isBold;


    public Font(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }
}
