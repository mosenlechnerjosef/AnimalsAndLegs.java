import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length, width, and height of the cuboid:");

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        scanner.close();

        double surfaceArea = 2 * ((length * width) + (width * height) + (height * length));
        double volume = length * width * height;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}

