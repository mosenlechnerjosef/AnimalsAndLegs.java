import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy nem negatív egész számot: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Kérjük, adjon meg egy nem negatív számot.");
        } else {
            int sum = sumOfDigits(number);
            System.out.println("A számjegyek összege: " + sum);
        }
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else 
        {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
    
}

