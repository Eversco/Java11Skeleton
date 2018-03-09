import java.util.Scanner;
public class Microwave {
    public static void main(String[] args) {
       int itemAmount;
       double time, resultTime;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount of items you are about to microwave.");
       itemAmount = sc.nextInt();
       System.out.println("Enter the time for heating one item in minute.");
       time = sc.nextDouble();
       resultTime = (time * 1.5);
       System.out.println("You need to microwave them for " + resultTime + " minutes");
    }
}