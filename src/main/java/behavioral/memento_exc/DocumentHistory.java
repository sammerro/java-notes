package behavioral.memento_exc;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    List<DocumentState> documentStateList = new ArrayList<>();

    public void push(DocumentState documentState) {
        documentStateList.add(documentState);
    }

    public DocumentState pop() {
        if (documentStateList.isEmpty()) {
            return null;
        }
        int idx = documentStateList.size() - 1;
        DocumentState documentState = documentStateList.get(idx);
        documentStateList.remove(idx);
        return documentState;
    };
}
