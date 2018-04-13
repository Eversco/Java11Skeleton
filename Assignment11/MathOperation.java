import java.util.Scanner;
public class MathOperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double alpha, beta;
        System.out.println("Please enter two random numbers:");
        alpha = sc.nextDouble();
        beta = sc.nextDouble();
        System.out.println("If add: " + (alpha + beta));
        System.out.println("If subtract: " + (alpha - beta) + " or " + (beta - alpha));
        System.out.println("If multiply: " + (alpha * beta));
        System.out.println("If divide: " + (alpha / beta) + " or " + (beta / alpha));
    }
}