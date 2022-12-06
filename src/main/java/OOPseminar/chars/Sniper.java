package OOPseminar.chars;

import java.util.List;
import java.util.Random;

public class Sniper extends Unit{
    private int shoots;

    public Sniper(List<Unit> gang, List<Unit> side, int x, int y) {
        super(12, 10, new int[]{8, 10}, 15, 9, "Stand", "Sniper");
        super.gang = gang;
        super.position = new Vector2(x, y);
        shoots = 32;
        super.side = side;
        quantity = new Random().nextInt(1, 5);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }

    @Override
    public void step() {
        for (Unit unit : super.gang) {
            if (unit.getName().equals("Peasant")) {
                shoots++;
                unit.setAction("used");
                break;

            }
        }
        if (shoots > 0) {
            double dist = Double.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < side.size(); i++) {
                double tmp = side.get(i).getPosition().getDist(this.position);
                if(dist > tmp && !side.get(i).getAction().equals("dead")) {
                    dist = tmp;
                    index = i;
                }
            }

            if(index >= 0) {

                side.get(index).getHit(speed > dist ? calcDamage(side.get(index)): calcDamage(side.get(index)) / 2);
                shoots--;
            }
        }

    }
}

