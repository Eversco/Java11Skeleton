import java.util.Scanner;
class NameEchoAlt {
    public static void main (String[] args) {
        String yourName;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        yourName = scan.nextLine();
        System.out.print("Hello, " + yourName + ".");
    }
}