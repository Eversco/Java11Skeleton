import java.util.Scanner;
import java.util.Random;

class RandomGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();

        int num, guess;
        num = generaterandom.nextInt(100) + 1;
        guess = scan.nextInt();
        if (guess == num) {
            System.out.println("Hooray! You guessed it! Now you get nothing.");
        }
        else {
            if(num < guess) {
                System.out.println("You were off by " + (guess - num) + " more");
        }
        else {
            System.out.println("You were off by " + (num - guess) + " less");
        }
    }
}
}