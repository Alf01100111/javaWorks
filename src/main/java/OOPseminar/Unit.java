package OOPseminar;

import java.util.List;

public abstract class Unit implements UnitInterface {
    protected int attack;
    protected int protect;
    protected int[] damage;
    protected float health;
    protected final float maxHealth;
    protected int speed;
    protected String state;
    protected List<Unit> gang;

    public Unit(int attack, int protect, int[] damage, float health, int speed, String state){
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.health = health / 2;
        this.speed = speed;
        this.state = state;
        this.maxHealth = health;
    }

    @Override
    public String toString() {
        return "А:" + attack + ", Защ:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", C:" + speed;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "А:" + attack + ", Защ:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", C:" + speed;
    }
}

