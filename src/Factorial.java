public class Factorial {

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nem lehet negatív az érték");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long calculateFactorialRecursively(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nem lehet negatív az érték");
        }

        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorialRecursively(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        long iterativeFactorial = calculateFactorial(n);
        long recursiveFactorial = calculateFactorialRecursively(n);

        System.out.println("Ciklusos megoldás " + n + ": " + iterativeFactorial);
        System.out.println("Rekurzív megoldás " + n + ": " + recursiveFactorial);
    }
}
