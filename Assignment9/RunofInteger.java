import java.util.Scanner;

class RunofInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count; // Variable for repeating

        int end; // Variable for the end of the count

        int Start; // Variable for the first number

        System.out.println("Enter Start:");

        Start = scan.nextInt();
        
        System.out.println("Enter End:");
        
        end = scan.nextInt();

        count = Start; // equaling the count to start for the first number

        while (count <= end) { // looping and limit the count
            System.out.println(count); // printing out the count which is looping
            count = count + 1; // increasing the count
        }
    }
}