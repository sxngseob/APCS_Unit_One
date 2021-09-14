import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int number1 = number - 1;
        int number2 = number + 1;

        System.out.print(number1 + " " + number + " " + number2);

    }
}