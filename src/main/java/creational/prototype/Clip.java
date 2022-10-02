package creational.prototype;

public class Clip implements Component {

    @Override
    public Component duplicate() {
        Clip clip = new Clip();
        return clip;
    }
}
