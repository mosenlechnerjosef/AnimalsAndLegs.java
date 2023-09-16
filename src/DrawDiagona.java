import java.util.Scanner;

public class DrawDiagona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the square size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i == size - j + 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

