import java.util.Scanner;

class OkoaException extends Exception {
    OkoaException(String output) {
        super(output);
    }
}

public class Okoa {
    static double okoaAmount;

    static void validate() throws OkoaException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount to okoa");
        okoaAmount = scanner.nextDouble();
    }

    public static void main(String[] args) {
        try {
            validate();

            if (okoaAmount < 50) {
                throw new OkoaException("You are not Eligible to okoa");
            } else {
                System.out.println("You are Eligible to Okoa");
            }
        } catch (OkoaException e) {
            System.out.println(e.getMessage());
        }
    }
}