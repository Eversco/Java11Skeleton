import java.util.Scanner;
public class ConcertTickets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double price, quantity, sub, gst, pst, total;
        System.out.println("Please enter your ticket price first and enter the amount you are buying.");
        price = sc.nextDouble();
        quantity = sc.nextDouble();
        sub = price * quantity;
        gst = sub * 0.06;
        pst = sub * 0.07;
        total = sub+pst+gst;
        System.out.println("Total: "+total);
    }
}