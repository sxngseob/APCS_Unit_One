public class TotalWithTax {

    public static void main(String[] args)
    {
        //Declare the variables and the constant.
        final double taxRate;
        double tax;
        double price;
        double total;

        price = 52.75;
        taxRate = 0.0825;

        //Make the calculations and assign

        tax = price * taxRate;

        //the results to the appropriate variables.

        total = price + tax;

        //Print the results.

        System.out.println("Price: $" + (price));
        System.out.println("Sales Tax: $" + (tax));
        System.out.println("Total: $" + (total));

    }
}
