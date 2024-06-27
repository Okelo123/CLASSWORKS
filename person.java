import java.util.Scanner;

public class person {
    Scanner parttime = new Scanner(System.in);
    int age;
    String name;

    void change_address() {
        System.out.println("Enter your name=");
        name = parttime.nextLine();
        System.out.println("Enter age=");
        age = parttime.nextInt();
    }
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.Compute_netsal();
    }
}

class Teacher extends person {
    double basicPay, houseAllowance, tax, grossPay;

    void Compute_netsal() {
        change_address();

        Scanner parttime = new Scanner(System.in);

        System.out.println("Enter Basic pay: ");
        basicPay = parttime.nextDouble();
        System.out.println("Enter House allowance: ");
        houseAllowance = parttime.nextDouble();
        System.out.println("Enter rate of taxation (%): ");
        tax = parttime.nextDouble() / 100;

        grossPay = basicPay + houseAllowance;
        double netSalary = grossPay - (basicPay * tax);

        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("House Allowance: " + houseAllowance);
        System.out.println("Gross Pay: " + grossPay);
        System.out.printf("Net Salary: %.2f\n", netSalary);
    }

    
}