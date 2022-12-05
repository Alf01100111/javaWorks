package OOPseminar;

import OOPseminar.chars.*;

import java.util.*;


public class Main {
    public static final int GANG_SIZE = 10;

    public static List<Unit> whiteSide;
    public static List<Unit> blackSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);

        while (true) {


            ConsoleView.view();
            turnMove();

            scanner.nextLine();
            }

        }

        private static void turnMove() {
            List<Unit> sortSide = new ArrayList<>();
            sortSide.addAll(whiteSide);
            sortSide.addAll(blackSide);
            sortSide.sort(new Comparator<Unit>() {
                @Override
                public int compare(Unit o1, Unit o2) {
                    int tmp = o2.getSpeed() - o1.getSpeed();
                    return tmp;
                }
            });
            sortSide.forEach(Unit::step);
        }






        /*List<Unit> whiteSide = new ArrayList<>();
        List<Unit> blackSide = new ArrayList<>();
        while (whiteSide.size() < GANG_SIZE) {
            whiteSide.add(getUnit(0, whiteSide));
            blackSide.add(getUnit(3, blackSide));
        }

        whiteSide.forEach(unit -> System.out.println(unit.getInfo()));
        blackSide.forEach(unit -> System.out.println(unit.getInfo()));

        System.out.println();

        whiteSide.forEach(Unit::step);
        blackSide.forEach(Unit::step);

        whiteSide.forEach(unit -> System.out.println(unit.getInfo()));
        blackSide.forEach(unit -> System.out.println(unit.getInfo()));

        System.out.println();

    }


    private static Unit getUnit(int origin, List<Unit> side) {
        int num = new Random().nextInt(origin, origin + 4);
        return switch (num) {

            case 0 -> new Monk(side);
            case 1 -> new Robber();
            case 2 -> new Sniper();
            case 3 -> new Peasant();
            case 4 -> new Spearman();
            case 5 -> new Wizard(side);
            default -> new Xbowman();
        };

    }

    private static void getType(List<Unit> units, String type) {
        for (Unit unit: units) {
            if (unit.toString().split(" ")[0].equals(type)) {
                System.out.println(unit);
            }
        }
    }*/

    private static void init() {
        whiteSide = new ArrayList<>();
        blackSide = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant(whiteSide, blackSide, x, y++));
                    break;
                case 1:
                    whiteSide.add(new Robber(whiteSide, blackSide, x, y++));
                    break;
                case 2:
                    whiteSide.add(new Sniper(whiteSide, blackSide, x, y++));
                    break;
                default:
                    whiteSide.add(new Monk(whiteSide, blackSide, x, y++));
            }
        }

        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    blackSide.add(new Peasant(blackSide, whiteSide, x, y++));
                    break;
                case 1:
                    blackSide.add(new Spearman(blackSide, whiteSide, x, y++));
                    break;
                case 2:
                    blackSide.add(new Xbowman(blackSide, whiteSide, x, y++));
                    break;
                default:
                    blackSide.add(new Wizard(blackSide, whiteSide, x, y++));
            }
        }

    }
}
