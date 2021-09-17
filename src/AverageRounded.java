import java.util.Scanner;

public class AverageRounded {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three positive decimal numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double total = num1 + num2 + num3;
        double average = (total / 3) + 0.5;
        int result = (int) average;

        System.out.println("Average = " + result);

    }
}
