package structural_test.decorator;

public class Test {

    public static void main(String[] args) {
        System.out.println("ATTACK!!!");


        Weapon weapon = new FlamingWeapon(new Sword(19, 29, 9));
        weapon.attack();
        weapon.attack();
        weapon.attack();
    }
}
