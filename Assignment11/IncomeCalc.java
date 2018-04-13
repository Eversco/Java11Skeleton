import java.util.Scanner;
public class IncomeCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double perHour, Hours, gross, tax, net;
        System.out.println("Please enter your payment per hour:");
        perHour = sc.nextDouble();
        System.out.println("Please enter how much you have worked:");
        Hours = sc.nextDouble();
        gross = perHour * Hours;
        tax = gross * 0.3;
        net = gross - tax;
        System.out.println("Your gross pay is: " + "$" + gross);
        System.out.println("Your tax: " + tax);
        System.out.println("Your net income is: " + net);
    }
}