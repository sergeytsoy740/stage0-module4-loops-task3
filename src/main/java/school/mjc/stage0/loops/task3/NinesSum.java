package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nine = 9;
        String num = "";
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            num = num + nine;
            sum = sum + Integer.valueOf(num);
        }
        System.out.println(sum);
    }
}
