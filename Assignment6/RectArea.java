
import java.util.Scanner;
class RectArea {

    public static void main(String[] args) {
//* Create a new scanner object:
        Scanner scan = new Scanner(System.in);
//* Declare two variable
        long area, width, height;
//* Prompt for input
        System.out.println("Enter an integer:");
//*
        width = scan.nextInt();
        height = scan.nextInt();

        area = width * height;

        System.out.println ( "The area of " + width + " X " + height + " is " + area);
    }
}