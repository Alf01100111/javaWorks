package OOPseminar.chars;

import java.util.List;

public class Xbowman extends Unit{

    private int shoots;

    public Xbowman(List<Unit> gang, int x, int y) {
        super(6, 3, new int[]{2, 3}, 10, 4, "Stand", "Xbowman");
        shoots = 16;
        super.gang = gang;
        super.position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + super.getInfo() + ", выстрелы: " + shoots + ", " + state;
    }
}
