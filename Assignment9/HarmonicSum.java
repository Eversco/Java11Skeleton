import java.util.Scanner;
public class HarmonicSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, o = 1; // Variables
        double sum = 0; // variable's final result
        System.out.println("Enter N:");
        n = sc.nextInt();
        while (o <= n){// loop
            sum = sum + (1.0/o);
            o++;
    }
        System.out.println(sum);// final result
}
}