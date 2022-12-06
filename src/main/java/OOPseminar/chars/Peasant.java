package OOPseminar.chars;

import java.util.List;
import java.util.Random;

public class Peasant extends Unit{
    private boolean delivery;

    public Peasant(List<Unit> gang, List<Unit> side, int x, int y) {
        super(1, 1, new int[]{0, 1}, 1, 3, "Stand", "Peasant");
        delivery = true;
        super.position = new Vector2(x, y);
        super.side = side;
        quantity = new Random().nextInt(1, 20);

    }

    @Override
    public void step() {
        if (state.equals("used")) {
            state = "state";
        }
    }



    @Override
    public String getInfo() {
        return "Крестьянин " + super.getInfo() + " доставка " + state;
    }
}
