import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r, g, tries;
        // the rule
        System.out.println("Hi! This is a guessing game. I'll pick a number and you guess the number from 1 to 10. If you lose, you get criticized. if you win, you get nothing.");
        tries = 3; 
        r = (int)(Math.random() * 10) + 1; // generates random numbers
        boolean correct = true;
        while (tries != 0){
            g = sc.nextInt();
            
            if (g < 1 || g > 10) { // for those nerds that did not read the rule
                System.out.println("Dude, not even close...... That's out of range. That's okay I won't count that.");
            } else if (g != r) { // if you are wrong. You can guess few more times
                correct = false;
                System.out.println("Nope. Try it again.");
                tries = tries - 1;
            }
            else { // if you are right the loop ends without any conditions
              System.out.println("Hooray! You got it!");
              correct = true;
              break;
            }
        }
        // if you are not right and you used all the tries, then you lose
        if (correct == false) {
                System.out.println("Oof. That's okay. It's just a game.");
            }
        
    }
}