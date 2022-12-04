package OOPseminar.chars;

import java.util.List;

public class Peasant extends Unit{
    private boolean delivery;

    public Peasant(List<Unit> gang, int x, int y) {
        super(1, 1, new int[]{0, 1}, 1, 3, "Stand", "Peasant");
        delivery = true;
        super.position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + super.getInfo() + " доставка " + state;
    }
}
