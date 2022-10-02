package behavioral_test.state;

public class MichalHero implements Hero {

    private String name = "Michallo";
    private HeroState state;

    public MichalHero() {
        this.state = new BareHandsHeroState();
    }

    public void setState(HeroState state) {
        this.state = state;
    }

    @Override
    public void run() {
        state.run();
    }

    @Override
    public void fight() {
        state.fight();

    }

    @Override
    public void jump() {
        state.jump();
    }
}
