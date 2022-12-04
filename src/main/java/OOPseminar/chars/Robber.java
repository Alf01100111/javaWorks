package OOPseminar.chars;

import java.util.List;

public class Robber extends Unit{

    public Robber(List<Unit> gang, int x, int y) {
        super(8, 3, new int[]{2, 4}, 10, 6, "Stand", "Robber");
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return "Разбойник " + super.getInfo() + ", " + state;
    }
}

