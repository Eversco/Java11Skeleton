import java.util.Scanner;
import java.util.Random;

public class TestYourLuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generaterandom = new Random();
        
        int guess, num;
        int corrects = 0;
        num = generaterandom.nextInt(100) + 1;
        for (int i = 0; i < 10; i++){
            if(num <= 50) {
                num = 1;
            }
            else {
                num = 2;
            }
            System.out.println("Enter 1 for 1 to 50, Enter 2 for 51 to 100");
            guess = sc.nextInt();
            if(guess == num){
                corrects++;
            }
        }
        System.out.println("You got " + corrects + " corrects");
        if(corrects >= 6){
            System.out.println("Lucky");
        }
    }
}