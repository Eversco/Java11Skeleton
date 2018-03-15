import java.util.Scanner ;

public class IntegerAdding {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int n, tot, input,c;

        tot = 0;

        System.out.println("How many integers will be added?");

        n = scan.nextInt();

        c = 0;//you are going to count so start at zero

        //keep going while your counter is less than the number of times you want to print
        while (c < n) {

            System.out.println ( "Enter an integer:" );

            input = scan.nextInt ();

            tot = tot + input;

            c++;//this means add 1 to c you could do c=c+1; instead
        }

        System.out.println ( "The sum is " + tot + ".");
    }
}