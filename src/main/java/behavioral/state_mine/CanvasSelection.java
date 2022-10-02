package behavioral.state_mine;

public class CanvasSelection extends CanvasState {

    public CanvasSelection(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void mouseUp() {
        System.out.println("Selection default cursor");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection active cursor");
    }
}
