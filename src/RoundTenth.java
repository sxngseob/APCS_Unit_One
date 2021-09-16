import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Prompt the user for a positive decimal number
        System.out.print("Decimal number? ");
        double num1 = scan.nextDouble();
        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/
        double num2 = num1 * 10;
        double num3 = num2 + 0.5;
        int num4 = (int) num3;
        double result = num4 / 10.0;
        System.out.println(num1 + " rounded to the nearest tenth is " + result);

        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5


    }
}
