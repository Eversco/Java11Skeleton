 public class Question3 {
public static void main(String[] args) {
        double ticketPrice = 23.45;
        double quantity = 8;
        double taxRate = 0.12;
        
        System.out.println("Total cost = " + (ticketPrice * quantity) * taxRate + "dollars.");
        System.out.println("Tax = " + ((ticketPrice * quantity) * taxRate) + (ticketPrice + quantity) + " dollars");
    }
}