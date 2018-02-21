import java.util.Scanner;
class Question2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long priceperunit, width, height, area, total;

        System.out.println("Enter an integer:");
        System .out.println("width");
        width = scan.nextInt();
        System.out.println("height");
        height = scan.nextInt();
        System.out.println("Price per unit");
        priceperunit = scan.nextInt();

        area = width * height;
        total = area * priceperunit;
        

        System.out.println ( "The price of the paint is " + width + " x " + height + " equals " + area + " and " + "x " + priceperunit + " which equals " + total);
    }
}