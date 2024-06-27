import java.util.Scanner;

public class Shape {
    Scanner read = new Scanner(System.in);
    int base, height;

    void getData() {
        System.out.println("Enter the Base:");
        base = read.nextInt();
        System.out.println("Enter Height:");
        height = read.nextInt();
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.areaT();
        Rectangle r = new Rectangle();
        r.areaR();
    }
}

class Triangle extends Shape {
    void areaT() {
        getData();
        double triangleArea = 0.5 * base * height;
        System.out.println("The area of the Triangle is: " + triangleArea);
    }
}

class Rectangle extends Shape {
    void areaR() {
        getData();
        int rectangleArea = base * height;
        System.out.println("The area of the Rectangle is: " + rectangleArea);
    }
}
