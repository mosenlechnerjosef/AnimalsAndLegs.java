import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the diamond height: ");
        int height = scanner.nextInt();
        
        if (height % 2 == 0) {
            System.out.println("Please enter an odd number for the diamond height.");
            return;
        }
        
        for (int i = 1; i <= height; i += 2) {
            for (int j = 0; j < (height - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = height - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (height - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
