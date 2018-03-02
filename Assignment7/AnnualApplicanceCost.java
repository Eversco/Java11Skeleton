import java.util.Scanner;

class AnnualApplicanceCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double kwh;
        double pricePerKwh;
        double total;
        System.out.println("Enter the energy you have used in Kilo-watt hour");
        kwh = sc.nextDouble();
        System.out.println("Enter the current price of electricity in price per kilo-watt hour");
        pricePerKwh = sc.nextDouble();
        total = kwh * pricePerKwh;
        System.out.println("You are going to spend $" + total + " for the electricity.");
        
    }
}