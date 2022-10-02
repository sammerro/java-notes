package creational.prototype;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        Component duplicate = component.duplicate();
        System.out.println("Duplicated");
        timeline.add(duplicate);
    }
}
