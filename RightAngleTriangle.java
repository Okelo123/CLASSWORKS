

    private static class base {

        public base() {
        }
    }
class RightAngleTriangle{
    private final double base;
    private final double height;

    // Parameterized constructor
    public RightAngleTriangle(double base, double height) {
    this.base = base;
    this.height = height;
}

    this.base=base;


        
        this.height = height;
    }

    // Function to calculate the length of the third side (hypotenuse)
    public double calculateThirdSide() {
        double thirdSide = Math.sqrt(base * base + height * height);
        return thirdSide;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        // Initializing dimensions with default values
        double defaultBase = 12.0;
        double defaultHeight = 5.0;

        // Creating an instance of RightAngledTriangle with default dimensions
        RightAngledTriangle triangle = new RightAngledTriangle(defaultBase, defaultHeight);

        // Calculating the length of the third side
        double thirdSide = triangle.calculateThirdSide();

        // Outputting the result
        System.out.println("The length of the third side of the right-angled triangle is: " + thirdSide + " cm");
    }
}
