package hexlet.code;

import java.util.Random;

public class Utils {
    private static Random random = new Random();
    public static int randomizer(int origin, int bound) {
        return random.nextInt(origin, bound);
    }
}