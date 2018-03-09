import java.util.Scanner;

public class Deli {
    public static void main(String[] args){
        String item;
        double price;
        double shipCost = 0.0;
        int Delivery;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item: ");
        item = scan.nextLine();
        System.out.println("Enter the price: ");
        price = scan.nextDouble();
        System.out.println("Do you want fast ship? 0==no 1==ya");
        Delivery = scan.nextInt();
        if (price < 10.00) {
            shipCost += 2.00;
        }
        if (Delivery == 1) {
            shipCost += 3.00;
        }
        System.out.println("Invoice:");
        System.out.println(item + ": $" + price);
        System.out.println("Delivery: $" + Delivery);
        System.out.println("Total: $" + (shipCost + price));
    }
}