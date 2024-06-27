import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = input.nextInt();
        
        if(choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = (9.0/5.0) * celsius + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if(choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (5.0/9.0) * (fahrenheit - 32);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        input.close();
    }
}
