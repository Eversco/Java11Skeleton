import java.util.Scanner;
class Eggs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long alleggs, dozens, each, left;
        dozens = 12;

        System.out.println("Enter eggs amount:");
        alleggs = scan.nextInt();

        each = alleggs / dozens;
        left = alleggs % dozens;

        System.out.println ( "There are " + each + " dozens of eggs " + "and " + left + " left.");
    }
}