import java.util.Scanner;

public class student {
    // Member variables
    private int admno;
    private String sname;
    private float eng;
    private float math;
    private float science;
    private float total;

    // Constructor
    public student() {
    }

    // Function to calculate total
    public void calculateTotal() {
        total = eng + math + science;
    }

    // Function to accept values and calculate total
    public void acceptData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Admission Number:");
        admno = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Student Name:");
        sname = scanner.nextLine();
        System.out.println("Enter English marks:");
        eng = scanner.nextFloat();
        System.out.println("Enter Math marks:");
        math = scanner.nextFloat();
        System.out.println("Enter Science marks:");
        science = scanner.nextFloat();
        calculateTotal();
    }

    // Function to display data members
    public void showData() {
        System.out.println("Admission Number: " + admno);
        System.out.println("Student Name: " + sname);
        System.out.println("English Marks: " + eng);
        System.out.println("Math Marks: " + math);
        System.out.println("Science Marks: " + science);
        System.out.println("Total Marks: " + total);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        student student = new student();
        student.acceptData();
        student.showData();
    }
}
