import java.util.Scanner;
import java.util.Random;

class SumRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();// generate random number

        int num;
        int sum = 0;
        for (int i = 0; i < 100; i++) { // allow 100 numbers
            num = generaterandom.nextInt(25) + 1; // generate numbers between 1 to 25
            sum = sum + num; // sum increases
            System.out.println(i + " " + num);
        }
        System.out.println("Total: " + sum); //total sum
    }
}