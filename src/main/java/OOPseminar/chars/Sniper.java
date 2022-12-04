package OOPseminar.chars;

import java.util.List;

public class Sniper extends Unit{
    private int shoots;

    public Sniper(List<Unit> gang, int x, int y) {
        super(12, 10, new int[]{8, 10}, 15, 9, "Stand", "Sniper");
        super.gang = gang;
        super.position = new Vector2(x, y);
        shoots = 32;
    }

    @Override
    public String getInfo() {
        return "Снайпер " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }
}