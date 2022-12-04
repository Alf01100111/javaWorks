package OOPseminar.chars;

import java.util.List;

public class Spearman extends Unit{

    public Spearman(List<Unit> gang, int x, int y) {

        super(4, 5, new int[]{1, 3}, 10, 4, "Stand", "Spearman");
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + super.getInfo() + state;
    }
}