public class Main {
    public static void main(String[] args) {
        TaxWhiz taxWhiz = new TaxWhiz(0.08); // create a TaxWhiz object with a tax rate of 8%
        double price = 100.0;
        double tax = taxWhiz.calcTax(price);
        System.out.println("Tax on Ksh" + price + " is Ksh" + tax);

        // update the tax rate to 9%
        taxWhiz.setTaxRate(0.09);
        tax = taxWhiz.calcTax(price);
        System.out.println("Tax on Ksh" + price + " is now Ksh" + tax);
    }
}