package behavioral.state_mine;

public class CanvasEraser extends CanvasState{

    public CanvasEraser(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void mouseUp() {
        System.out.println("Eraser default cursor");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser active cursor");
    }
}
