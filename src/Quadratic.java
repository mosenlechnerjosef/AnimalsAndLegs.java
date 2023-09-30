import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Kérem adja meg az 'a' értéket: ");
        double a = scanner.nextDouble();

        System.out.println("Kérem adja meg a 'b' értéket: ");
        double b = scanner.nextDouble();

        System.out.println("Kérem adja meg a 'c' értéket: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
           
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Két valós zérushely van:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
          
            double x1 = -b / (2 * a);
            System.out.println("Egy valós zérushely van:");
            System.out.println("x1 = " + x1);
        } else {
          
            System.out.println("Nincs valós zérushely.");
        }
    }
}
