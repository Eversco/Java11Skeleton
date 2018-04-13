import java.util.Scanner;
public class CreditCardBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance, payment, interest, tot;
        int month;
        System.out.println("Enter the monthly payment: ");
        month = 1; // The number of the month
        payment = sc.nextDouble(); // Decision on payment
        interest = 1.015; // Charged on unpaid amount each month 
        balance = 1000;
        while (balance > 0) {
            balance = (balance * interest) - payment; // 1.5% of unpaid balance added and decreased with payment
            tot = payment * month; // Total payment
            System.out.println("Month " + month + ": Balance: " + balance + " Total: " + tot); // Result of month
            month = month + 1; // Each months
        }
        System.out.println("All Clear!");
    }
}