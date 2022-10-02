package behavioral_test.state;

public class BareHandsHeroState implements HeroState {

    @Override
    public void run() {
        System.out.println("Running 15km/h");
    }

    @Override
    public void fight() {
        System.out.println("Fight with bare hands, 1 dmg/ sec");
    }

    @Override
    public void jump() {
        System.out.println("Jumping 1m high.");
    }
}
