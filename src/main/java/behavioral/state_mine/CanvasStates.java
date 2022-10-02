package behavioral.state_mine;

public class CanvasStates {
    public static CanvasState create(ToolType toolType, Canvas canvas) {
        if (ToolType.BRUSH == toolType) {
            return new CanvasSelection(canvas);
        }
        if (ToolType.ERASER == toolType) {
            return new CanvasEraser(canvas);
        }
        if (ToolType.SELECTION == toolType) {
            return new CanvasSelection(canvas);
        }
        throw new RuntimeException("Not implemented CanvasState for " + toolType.name());
    }

}
