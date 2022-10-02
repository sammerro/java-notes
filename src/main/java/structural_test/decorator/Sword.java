package structural_test.decorator;

public class Sword extends AbstractWeapon implements Weapon {

    public Sword(int damage, int dist, int speed) {
        super(damage, dist, speed);
    }

    @Override
    public void attack() {
        System.out.printf("Making %d damage, speed %d, distance %d", this.damage, speed, dist);
    }
}
