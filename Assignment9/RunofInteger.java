import java.util.Scanner;

class RunofInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count;

        int end;

        int times;

        System.out.println("Enter Start:");

        times = scan.nextInt();
        
        System.out.println("Enter End:");
        
        end = scan.nextInt();

        count = times;

        while (count<=times) {
            System.out.println(count);
            count = count + 1;
        }
    }
}