package structural_test.adapter;

import java.util.List;

public class Canvas {

    public void drawShapes(List<Shape> list) {
        for (Shape shape : list) {
            shape.draw();
        }
    }
}
