/**
 * Created by softish on 2016-08-02.
 */
public class Fib {

    public static void main(String[] args) {
        // run out of ints after 45
        fib(90);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("1836311903");

        for (int i = 0; i < 100; i++) {
            //System.out.println("nr " + i +" : " + findFib(i + 1));
        }
    }

    private static void fib(int target) {
        long current = 1, previous = 1, tmp = 0;
        long evenSum = 0, evenAmount = 0;

        for (int i = 0; i < target; i++) {
            System.out.println(current);
            tmp = current;
            current += previous;
            previous = tmp;
            if(current % 2 == 0) {
                evenSum += current;
                evenAmount++;
            }

        }
        System.out.println(evenSum + " even sum, amount: " + evenAmount);
    }

    private static long findFib(long n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return findFib(n - 1) + findFib(n - 2);
        }
    }

    /*
    private static long findFib(int n, int prev, int start) {
        if(start == 1 || prev == 1) {
            return 1;
        } else {
            return findFib(n) + prev;
        }
    }
    */

    private static void addNumbersOutsideRange() {
        // 00 00 00 00
        byte[] arr = new byte[10];  // 80bit/8byte




    }
}
