package OOPseminar.chars;

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
    protected Vector2 position;
    protected String name;

    public Unit(int attack, int protect, int[] damage, float health, int speed, String state, String name){
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.health = health / 2;
        this.speed = speed;
        this.state = state;
        this.maxHealth = health;
        this.name = name;
    }

    public Vector2 getPosition(){return position;}

    @Override
    public String toString() {
        return "А:" + attack + ", Защ:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", C:" + speed;
    }

    @Override
    public void step(List<Unit> gang) {
//        int index = 0;
//        float dist = Float.MAX_VALUE;
//        for (int i = 0; i < gang.size(); i++) {
//            if (....) {
//                index = i;
//                dist = ...;
//
//            }
//        }
//        position.x++;
    }

    @Override
    public String getInfo() {
        return "А:" + attack + ", Защ:" + protect + ", У:" + (damage[0] + damage[1]) / 2 + ", Зд:" + health + ", C:" + speed;
    }

    public String getName() {
        return name;
    }
}

