import java.util.Scanner;
public class NumberSquarer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to start: ");
        int num = sc.nextInt(); // this part doesn't really matter, it is just for the program to shut up about uninitialized value.
        int ans;
        while (num != 0){// ends when enter 0
          System.out.println("Enter number:");
          num = sc.nextInt();
          ans = num * num; // squaring number entered
          System.out.println(num + "^" + 2 + " = " + ans); // printing out result
        }
        System.out.println("Bye");
    }
}