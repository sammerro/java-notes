package behavioral_test.state;

public class FlyingHeroState implements HeroState {
    @Override
    public void run() {
        System.out.println("Flying 100 km / h");
    }

    @Override
    public void fight() {
        System.out.println("Can't fight while flying..");
    }

    @Override
    public void jump() {
        System.out.println("Can't jump while flying..");
    }
}
