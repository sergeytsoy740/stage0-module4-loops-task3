package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        if (lastFibonacci == 1) System.out.println(first);
        if (lastFibonacci == 2) System.out.println(first + "\n" + second);
        if (lastFibonacci > 2) {
            System.out.println(first + "\n" + second);
            int next = 0;
            for (int i = 3; i <= lastFibonacci; i++) {

                next = first + second;
                first = second;
                second = next;

                System.out.println(next);
            }
        }
    }
}
