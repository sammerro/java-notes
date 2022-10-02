package creational.prototype;

public class Audio implements Component {
    private int sound = 343542345;


    @Override
    public Component duplicate() {
        Audio audio = new Audio();
        audio.sound = this.sound;
        return audio;
    }
}
