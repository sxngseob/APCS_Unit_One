import java.util.Scanner;

public class FindTheAverage {

    public static void main(String[] args) {

        // Create a Scanner object to get user input
        Scanner scan = new Scanner(System.in);
        // Create a total variable to keep track of the total value
        double total;
        // Get four pieces of user input
        System.out.println("Enter four values.");
        System.out.print("Value 1: ");
        double value1 = scan.nextDouble();
        System.out.print("Value 2: ");
        double value2 = scan.nextDouble();
        System.out.print("Value 3: ");
        double value3 = scan.nextDouble();
        System.out.print("Value 4: ");
        double value4 = scan.nextDouble();


        // Calculate the average
        total = value1 + value2 + value3 + value4;
        double average = total / 4;

        // Display the result
        System.out.println("Average = " + average);



    }

}