import java.util.Scanner;
class TicketPrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long ticketamount, eachprice, total;
        String Moviename;
        
        System.out.println("Enter the movie's name");
        Moviename = scan.nextLine();
        System.out.println("Enter your quantity:");
        ticketamount = scan.nextInt();
        System.out.println("Enter the ticket price of the movie");
        eachprice = scan.nextInt();

         total = ticketamount * eachprice;

        System.out.println ( "You are going to spend " + total + " dollars on " + Moviename + " tonight.");
    }
}