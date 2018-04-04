import java.util.Scanner;

class MilesPerGallon {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double initialmiles, finalmiles, gallons;

        System.out.print("Enter initial miles: ");

        initialmiles = scan.nextDouble();
        //keep going while initialmiles is NOT negative 1
        while (!(initialmiles == -1)) {

            System.out.print("Enter Final Miles: ");

            finalmiles = scan.nextDouble(); //Variable equals users answer

            System.out.print("Enter gallons: ");

            gallons = scan.nextDouble(); // Variable equals users answer

            System.out.println("Miles per Gallon: "+( finalmiles-initialmiles )/gallons); //Print out calculation process

            System.out.println();

            System.out.print("Enter initial miles (-1 to exit): ");

            initialmiles = scan.nextDouble(); //Program ends when enter -1
        }

        System.out.println("Bye");
    }
}