import java.util.Scanner;

public class TileCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the lab (in meters): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the lab (in meters): ");
        double width = scanner.nextDouble();
        scanner.close();
        double labArea = calculateLabArea(length, width);
        int tileCount = calculateTileCount(labArea);

        System.out.println("The total area of the lab is: " + labArea + " square meters");
        System.out.println("The number of tiles required is: " + tileCount);
    }

    public static double calculateLabArea(double length, double width) {
        return length * width;
    }

    public static int calculateTileCount(double labArea) {
        double tileArea = 0.39;
        double tileCountDouble = labArea / tileArea;
        return (int) Math.ceil(tileCountDouble);
    }
}