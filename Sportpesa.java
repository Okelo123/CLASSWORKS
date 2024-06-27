public class Sportpesa {
    // Member variable
    private int bet;

    // Constructor
    public Sportpesa() {
        bet = 0; // Initialize bet to 0 in the constructor
    }

    // Member function to set the value of bet
    public void input() {
        bet = 1000; // Set bet to 1000
    }

    // Member function to output the value of bet
    public void display() {
        System.out.println("The value of bet is: " + bet);
    }

    // Main method to test the Sportpesa class
    public static void main(String[] args) {
        Sportpesa sportpesa = new Sportpesa();
        sportpesa.display(); // Display initial value of bet (should be 0)
        
        sportpesa.input();   // Set bet to 1000
        sportpesa.display(); // Display updated value of bet (should be 1000)
    }
}
