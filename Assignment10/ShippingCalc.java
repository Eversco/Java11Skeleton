import java.util.Scanner;
public class ShippingCalc {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double weight, cost = 3; //variables
        System.out.println("Weight of Order: ");
        weight = sc.nextDouble();
        while (weight > 0) { // will stop when enter 0
        cost = 3; // always equal 3
        if (weight > 10) {
         cost += (0.25 * (weight - 10)); // adding additonal
         System.out.println("Shipping Cost: " + cost);
        }
        else {
            System.out.println(cost); // same value
            System.out.println("Shipping Cost: " + cost);
        }
        System.out.println("Weight of Order: ");
        weight = sc.nextDouble();
    }
    System.out.println("bye");
}
}