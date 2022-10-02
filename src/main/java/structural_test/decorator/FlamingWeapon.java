package structural_test.decorator;

public class FlamingWeapon implements Weapon {

    private Weapon weapon;

    public FlamingWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println("Flaming....");
        this.weapon.attack();
    }
}
