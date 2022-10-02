package behavioral.state_mine;

public abstract class CanvasState implements CanvasIF {
    Canvas canvas;
    public CanvasState(Canvas canvas) {
        this.canvas = canvas;
    }
}
