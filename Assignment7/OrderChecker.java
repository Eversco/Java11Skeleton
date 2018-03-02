import java.util.Scanner;

public class OrderChecker {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final double boltPrice = 0.05;
    final double nutPrice = 0.03;
    final double washerPrice = 0.01;
    double bolts, nuts, washers, total;
    System.out.println("Please enter the number of bolt(s) you are about to purchase.");
    bolts = sc.nextDouble();
    System.out.println("Please enter the number of nut(s) you are about to purchase.");
    nuts = sc.nextDouble();
    System.out.println("Please enter the number of washer(s) you are about to purchase.");
    washers = sc.nextDouble();
    total = ((boltPrice * bolts) + (nutPrice * nuts) + (washerPrice * washers));
    if (bolts >= nuts || bolts >= (washers * 2)) {
    if (bolts >= nuts) {
            System.out.println("Too few nuts");
            System.out.println("The total price is $" + total);
    }
    if (bolts >= (washers * 2)) {
        System.out.println("Too few washers");
        System.out.println("The total price is $" + total);
    }
}
    else {
        System.out.println("The order is ok!");
        System.out.println("The total price is $" + total);
    }
   }
}