public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        // Increase the value of variable "a" by 10 and print the new value
        a += 10;
        System.out.println("a = " + a);

        int b = 100;
        // Decrease the value of b by 7 and print the new value
        b -= 7;
        System.out.println("b = " + b);

        int c = 44;
        // Double the value of c and print the new value
        c *= 2;
        System.out.println("c = " + c);

        int d = 125;
        // Divide the value of d by 5 and print the new value
        d /= 5;
        System.out.println("d = " + d);

        int e = 8;
        // Cube the value of e and print the new value
        e = e * e * e;
        System.out.println("e = " + e);

        int f1 = 123;
        int f2 = 345;
        // Determine if f1 is greater than f2 (print as a boolean)
        boolean isF1GreaterThanF2 = f1 > f2;
        System.out.println("f1 > f2: " + isF1GreaterThanF2);

        int g1 = 350;
        int g2 = 200;
        // Determine if double the value of g2 is greater than g1 (print as a boolean)
        boolean isDoubleG2GreaterThanG1 = (2 * g2) > g1;
        System.out.println("2 * g2 > g1: " + isDoubleG2GreaterThanG1);

        int h = 135798745;
        // Determine if h has 11 as a divisor (print as a boolean)
        boolean has11AsDivisor = h % 11 == 0;
        System.out.println("h has 11 as a divisor: " + has11AsDivisor);

        int i1 = 10;
        int i2 = 3;
        // Determine if i1 is greater than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean isI1InRange = i1 > (i2 * i2) && i1 < (i2 * i2 * i2);
        System.out.println("i1 is in the specified range: " + isI1InRange);

        int j = 1521;
        // Determine if j is divisible by 3 or 5 (print as a boolean)
        boolean isDivisibleBy3Or5 = (j % 3 == 0) || (j % 5 == 0);
        System.out.println("j is divisible by 3 or 5: " + isDivisibleBy3Or5);
    }
}
