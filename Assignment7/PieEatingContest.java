import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double contestantWeight;
        System.out.println("Please enter the weight of the contestant.If the the number is under than 30 or more than 250, the person is not allowed to join.");
        contestantWeight = sc.nextDouble();
        if (contestantWeight <= 220 || contestantWeight >= 280){
            System.out.println("Not allowed");
        }
        else {
            System.out.println("Allowed");
        }
    }
}