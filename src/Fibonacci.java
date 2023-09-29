public class Fibonacci {

    public static long fibonacci(int n) {
        if (n < 0) {
            System.out.println("Érvénytelen adat");
            return -1; 
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    public static long fibonacciRec(int n) {
        if (n < 0) {
            System.out.println("Érvénytelen adat");
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative Fibonacci(" + n + "): " + fibonacci(n));
        System.out.println("Recursive Fibonacci(" + n + "): " + fibonacciRec(n));

        n = -5;
        System.out.println("Iterative Fibonacci(" + n + "): " + fibonacci(n));
        System.out.println("Recursive Fibonacci(" + n + "): " + fibonacciRec(n));
    }
}
