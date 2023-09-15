import java.util.Scanner;

public class AverrageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Please enter a number: ");
            
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            }
        }

        scanner.close();

        
        
            double average = (double) sum / count;
            System.out.println("Sum: " + sum + ", Average: " + average);
        
    }
}