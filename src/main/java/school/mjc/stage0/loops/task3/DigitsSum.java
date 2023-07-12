package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String num = "" + t;
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum = sum + Integer.valueOf(num.charAt(i) + "");
        }
        System.out.println(sum);
    }
}
