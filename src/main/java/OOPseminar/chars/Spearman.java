package OOPseminar.chars;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Spearman extends Unit{

    public Spearman(List<Unit> gang, List<Unit> side, int x, int y) {

        super(4, 5, new int[]{1, 3}, 10, 4, "Stand", "Spearman");
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(2, 15);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + super.getInfo() + state;
    }

    @Override
    public void step() {
        double dist = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < side.size(); i++) {
            double tmp = side.get(i).getPosition().getDist(this.position);
            if(dist > tmp && !side.get(i).getAction().equals("dead")) {
                dist = tmp;
                index = i;
            }
        }
        if (index >= 0) {
            if (dist < 2) {
                side.get(index).getHit(calcDamage(side.get(index)));
            } else {
                Vector2 enemyPos = side.get(index).getPosition();
                Vector2 newPos = new Vector2(0, 0);
                if (enemyPos.y == position.y) {
                    newPos.y = position.y;
                    if (position.x - enemyPos.x < 0) {
                        newPos.x = position.x + 1;
                    } else {
                        newPos.x = position.x - 1;
                    }
                } else {
                    newPos.x = position.x;
                    if (enemyPos.y - position.y > 0) {
                        newPos.y = position.y + 1;
                    } else {
                        newPos.y = position.y + 1;
                    }
                }

                AtomicBoolean empty = new AtomicBoolean(true);
                gang.forEach(unit -> {
                    if (unit.getPosition().isEquals(newPos)) {
                        empty.set(false);
                    }
                });
                if (empty.get()) {
                    position = newPos;
                }

            }
        }


    }
}
