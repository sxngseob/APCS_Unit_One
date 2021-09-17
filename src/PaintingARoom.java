import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {

        //variables
        final int door = 15;
        final int window = 10;
        final double paint = 350;

        //user-input for length, width, and height
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length (ft): ");
        double length = scan.nextDouble();
        System.out.print("Enter the width (ft): ");
        double width = scan.nextDouble();
        System.out.print("Enter the height (ft): ");
        double height = scan.nextDouble();

        //# of door and window
        System.out.print("Enter the number of door: ");
        int numberDoor = scan.nextInt();
        System.out.print("Enter the number of window: ");
        int numberWindow = scan.nextInt();

        //ft^2 of door and window
        int areaDoor = door * numberDoor;
        int areaWindow = window * numberWindow;

        //area of each wall + ceiling
        double area1 = length * height;
        double area2 = width * height;
        double ceiling = width * length;
        double totalArea = (2 * area1) + (2 * area2) + ceiling - (areaDoor + areaWindow);

        //paint (door and window do not need to be painted)
        double paintNeed = totalArea / paint;
        int roundPaintNeed = (int) paintNeed + 1;

        //Print
        System.out.println("You need " + roundPaintNeed + " gallon(s) of paint");


    }

}
