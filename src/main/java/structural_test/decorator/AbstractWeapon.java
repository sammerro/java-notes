package structural_test.decorator;

public class AbstractWeapon {

    protected int damage;
    protected int dist;
    protected int speed;


    public AbstractWeapon(int damage, int dist, int speed) {
        this.damage = damage;
        this.dist = dist;
        this.speed = speed;
    }
}
