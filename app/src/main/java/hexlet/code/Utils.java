package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    public static int generateNumber(int origin, int bound) {
        return RANDOM.nextInt(origin, bound);
    }
}
