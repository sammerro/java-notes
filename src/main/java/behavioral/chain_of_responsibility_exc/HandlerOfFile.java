package behavioral.chain_of_responsibility_exc;

public abstract class HandlerOfFile {
    HandlerOfFile next;

    public HandlerOfFile(HandlerOfFile next) {
        this.next = next;
    }

    protected abstract boolean doHandle(String file);

    public boolean handle(String file) {
        boolean wasHandled = doHandle(file);
        if (wasHandled) return true;
        if (next != null) {
            return next.handle(file);
        }
        return false;
    }
}
