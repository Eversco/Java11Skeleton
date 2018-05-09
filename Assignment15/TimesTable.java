import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int timestable;
        
        System.out.println("Enter Times table:");
        timestable = sc.nextInt();
        int correctAnswer = 0; //Just for recording how many answers are correct
        for (int i = 1; i <= timestable; i++){ // the program starts at 1 and ends at the number of the timestable
            System.out.println(timestable + " x " + i);
            int answer = sc.nextInt();
            if (answer == timestable * i) { // if the answer is right, it prints out compliment, and also record correct
                System.out.println("Correct!");
                correctAnswer++;
            }
            else {
                System.out.println("Incorrect, the answer is " + (timestable * i)); // If the answer is wrong, prints out the real answer
            }
        }
        System.out.println("You got " + correctAnswer + " out of " + timestable + " questions right!"); // after the program ends, it give out questions answered correct and total questions
    }
}