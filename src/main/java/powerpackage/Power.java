package powerpackage;

public class Power {
    public static int find(int base, int exponent) {
        int result = 1;
        for (int i = 0; i<exponent; i++) {
            result *= base;
        }
        return result;
    }
}

