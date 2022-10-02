package behavioral.state_mine;

public class CanvasBrush extends CanvasState{

    public CanvasBrush(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void mouseUp() {
        System.out.println("BRUSH default cursor");
    }

    @Override
    public void mouseDown() {
        System.out.println("BRUSH active cursor");
    }

}
