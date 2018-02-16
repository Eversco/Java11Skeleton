import java.util.Scanner;
class NameEcho {
    public static void main (String[] args) {
        String yourName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        yourName = scan.nextLine();
        System.out.println("Hello, " + yourName + ".");
    }
}