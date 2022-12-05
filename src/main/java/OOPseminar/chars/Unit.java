package OOPseminar.chars;

import java.util.List;
import java.util.Random;

public abstract class Unit implements UnitInterface {
    protected int attack;
    protected int protect;
    protected int[] damage;
    protected float health;
    protected final float maxHealth;
    protected int speed;
    protected String state;
    protected List<Unit> gang, side;
    protected Vector2 position;
    protected String name;
    protected int quantity;


    public Unit(int attack, int protect, int[] damage, float health, int speed, String state, String name){
        this.attack = attack;
        this.protect = protect;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.state = state;
        this.maxHealth = health;
        this.name = name;
        quantity = new Random().nextInt(1, 21);
    }

    public void setAction(String state) {
        this.state = state;
    }

    public String getAction() {
        return state;
    }

    public Vector2 getPosition(){return position;}

    @Override
    public String toString() {
        return "A:" + attack + ", Def:" + protect + ", Dmg:" + (damage[0] + damage[1]) / 2 + ", HP:" + health + ", Spd:" + speed + ", St" + state;
    }

    @Override
    public void step() {
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

    public float calcDamage (Unit unit) {
        if(unit.protect - this.attack == 0) {
            return (this.damage[0] + this.damage[1]) / 2.0f;
        }
        if(unit.protect - this.attack < 0) {
            return this.damage[1];
        }
        return this.damage[0];
    }

    public void getHit(float damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            this.state = "dead";
        }
    }

    public int getSpeed() {
        return speed;
    }
}

