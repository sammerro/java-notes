package behavioral_test.state;

public class StateDemo {

    public static void main(String[] args) {
        MichalHero michalHero = new MichalHero();

        michalHero.fight();
        michalHero.run();
        michalHero.jump();
        michalHero.jump();
        michalHero.jump();


        michalHero.setState(new FlyingHeroState());

    }
}
