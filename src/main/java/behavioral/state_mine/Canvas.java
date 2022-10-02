package behavioral.state_mine;

public class Canvas implements CanvasIF {
    CanvasState canvasState = new CanvasSelection(this);

    public void changeTool(CanvasState canvasState) {
        this.canvasState = canvasState;
    }

    public void mouseUp() {
      canvasState.mouseUp();
    };

    public void mouseDown() {
        canvasState.mouseDown();
    };
}
