package behavioral.state_mine;

public class Test {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.mouseDown();
        canvas.mouseUp();

        canvas.changeTool(CanvasStates.create(ToolType.BRUSH, canvas));
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.changeTool(CanvasStates.create(ToolType.ERASER, canvas));

        canvas.mouseDown();
        canvas.mouseDown();
    }
}
