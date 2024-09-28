class UncheckedMarvelException {
    public static void performBattle(int power, int enemyPower) {
        try {
            System.out.println("Hero is battling with power: " + power + " against enemy power: " + enemyPower);
            int result = power / enemyPower;
            System.out.println("Battle result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hero couldn't battle: " + e.getMessage());
        }
    }

    public static void performBattle(double power, double enemyPower) {
        System.out.println("Hero is battling with double power: " + power + " against enemy power: " + enemyPower);
        double result = power / enemyPower;
        System.out.println("Battle result: " + result);
    }
}

public class marvel_3035_kika {
    public static void main(String[] args) {
        System.out.println("Marvel Unchecked Exception Handling");
        UncheckedMarvelException.performBattle(100, 0);
        UncheckedMarvelException.performBattle(100.0, 20.0);
    }
}
