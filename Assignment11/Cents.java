import java.util.Scanner;
public class Cents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cent, dollar;
        System.out.println("Please enter the amount of your cent: ");
        cent = sc.nextDouble();
        dollar = cent / 100;
        System.out.println("You have " + "$" + dollar);
    }
}