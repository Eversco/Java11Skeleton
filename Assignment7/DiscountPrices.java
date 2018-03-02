import java.util.Scanner;

class DiscountPrices {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double purchaseAmount, Rate;
     Rate = 0.1;
     System.out.println("Please enter the price you have purchase. Include the number of cent");
     purchaseAmount = sc.nextDouble();
     System.out.println("Your total after the discount is $" + (purchaseAmount - (purchaseAmount * Rate)) + ". Please round the number in order to purchase in the correct price.");
     
    }
}