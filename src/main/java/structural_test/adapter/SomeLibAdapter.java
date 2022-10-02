package structural_test.adapter;

public class SomeLibAdapter implements Shape{

    SomeLib someLib;

    public SomeLibAdapter(SomeLib someLib) {
        this.someLib = someLib;
    }

    @Override
    public void draw() {
        someLib.drawCircle("Shape", "red", 10);
    }
}
