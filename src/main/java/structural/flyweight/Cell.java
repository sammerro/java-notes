package structural.flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private Font font;
  private FontBank fontBank;

  public Cell(int row, int column, Font font, FontBank fontBank) {
    this.font = font;
    this.fontBank = fontBank;
    this.row = row;
    this.column = column;
    this.font = font;

  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getFontFamily() {
    return font.getFontFamily();
  }

  public void setFontFamily(String fontFamily) {
    font = fontBank.getFont(fontFamily, getFontSize(), isBold());
  }

  public int getFontSize() {
    return font.getFontSize();
  }

  public void setFontSize(int fontSize) {
    font = fontBank.getFont(getFontFamily(), fontSize, isBold());
  }

  public boolean isBold() {
    return font.isBold();
  }

  public void setBold(boolean bold) {
    font = fontBank.getFont(getFontFamily(), getFontSize(), bold);
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, getFontFamily());
  }
}
