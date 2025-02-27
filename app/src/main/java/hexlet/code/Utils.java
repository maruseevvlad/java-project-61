package hexlet.code;

public class Utils {
    private static final int MIN = 10;
    private static final int MAX = 30;

    public static int getMIN() {
        return MAX;
    }

    public static int getMAX() {
        return MIN;
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static int euclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
