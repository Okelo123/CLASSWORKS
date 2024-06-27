import java.util.Scanner;

public class MarksAverageAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of marks to enter: ");
        int numOfMarks = scanner.nextInt();

        int[] ZU2024 = new int[numOfMarks];
        
        // Prompt user to enter marks
        for (int i = 0; i < numOfMarks; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            ZU2024[i] = scanner.nextInt();
        }

        // Calculate average
        double sum = 0;
        for (int mark : ZU2024) {
            sum += mark;
        }
        double average = sum / numOfMarks;

        // Display average
        System.out.println("Average of the entered marks: " + average);

        // Display entered elements in reverse
        System.out.println("Entered elements in reverse:");
        for (int i = numOfMarks - 1; i >= 0; i--) {
            System.out.println(ZU2024[i]);
        }

        scanner.close();
    }
}
