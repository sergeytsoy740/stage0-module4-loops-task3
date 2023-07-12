package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int initialDivider = 1;

        if (first <= second) initialDivider = first;
        else initialDivider = second;

        int gcd = 1;

        for (int i = initialDivider; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
