package behavioral.memento_mine;

import java.util.ArrayList;

public class Editor {

    private String content;
    private ArrayList<String> contentMemory = new ArrayList<>();

    public void undo() {
        if (contentMemory.size() == 0) {
            return;
        }
        content = contentMemory.get(contentMemory.size() - 1);
        contentMemory.remove(contentMemory.size() -1);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        contentMemory.add(this.content);
        this.content = content;
    }

}
