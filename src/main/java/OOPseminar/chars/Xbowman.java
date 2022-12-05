package OOPseminar.chars;

import java.util.List;

public class Xbowman extends Unit{

    private int shoots;

    public Xbowman(List<Unit> gang, List<Unit> side, int x, int y) {
        super(6, 3, new int[]{2, 3}, 10, 4, "Stand", "Xbowman");
        shoots = 16;
        super.gang = gang;
        super.position = new Vector2(x, y);
        super.side = side;
    }

    @Override
    public void step() {
        for (Unit unit : super.gang) {
            if (unit.getName().equals("Peasant")) {
                if (!unit.getAction().equals("used") && !unit.getAction().equals("dead")) {
                    shoots++;
                    unit.setAction("used");
                    break;
                }
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

    @Override
    public String getInfo() {
        return "Арбалетчик " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }
}
