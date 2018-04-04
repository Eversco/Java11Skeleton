import java.util.Scanner;
public class InrangeAdder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int startRange, endRange;
        int sumInside =0, sumOutside = 0;
        int inp;
        System.out.println("In-range Adder");
        System.out.println("Low end of range:");
        startRange = sc.nextInt();
        System.out.println("High end of range");
        endRange = sc.nextInt();
        inp = sc.nextInt();
        while (inp !=0) {
            if (inp < startRange || inp > endRange){ // it would only count the outRange
                sumOutside = sumOutside + inp;
            } else { // it is within startRange and endRange, only print inRange
                sumInside = sumInside + inp;
            }
            System.out.println("Enter the data:");
            inp = sc.nextInt();
    }
    System.out.println("Inrange: " + sumInside);
    System.out.println("Outrange: " + sumOutside);
}
}