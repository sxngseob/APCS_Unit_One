import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
        // Create a Scanner object and write a prompt for the user to enter a number
        Scanner scan = new Scanner(System.in);
        // Declare a variable of the correct type that will receive the input from the user.
        System.out.print("Enter a negative decimal number: ");
        double roundedNum = scan.nextDouble();
        // Declare an variable and write an expression to round the user input
        // ex. int roundedNum=/*expression to round a negative value*/;
        int roundedNumber = (int) (roundedNum - 0.5);
        // Write a statement that will output the result in the form below.
        System.out.println(roundedNum + " rounded to a whole number is " + roundedNumber);
        // ex. -3.21 rounded to a whole number is -3



    }
}
