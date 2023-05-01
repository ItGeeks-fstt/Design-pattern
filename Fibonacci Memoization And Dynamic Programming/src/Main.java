import java.util.HashMap;

public class Main {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("start");
        long start = System.currentTimeMillis();

        System.out.println(fibonacci(4000));// o(2^n)
        System.out.println(fibonacci_memoized(4000));// o(n) optimal take more space`
        System.out.println(fibonacci_bottom_up(4000)); // o(n) optimal

        System.out.println(System.currentTimeMillis() - start);

        System.out.println("end");
//? input n = 40
//        without memoization
//    start
//102334155
//        1186
//    end
//        with memoization
//    start
//102334155
//        0
//    end

    }

    public static int fibonacci(int n) {
//        System.out.println("I am calculating the fibonacci on " + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacci_memoized(int n) {
//        System.out.println("I am calculating the fibonacci on " + n);
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, result);
            return result;
        }
    }

    public static int fibonacci_bottom_up(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
