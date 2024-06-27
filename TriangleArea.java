import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle: ");
        double c = scanner.nextDouble();
        scanner.close();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("The area of the triangle is: %.3f", area);
    }
}