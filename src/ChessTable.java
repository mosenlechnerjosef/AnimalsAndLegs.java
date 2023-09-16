import java.util.Scanner;

public class ChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the chess table size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
