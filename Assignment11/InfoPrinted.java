import java.util.Scanner;
public class InfoPrinted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n, a, c, pr, pc;
        System.out.println("Please enter your name:");
        n = sc.nextLine();
        System.out.println("Please enter your address:");
        a = sc.nextLine();
        System.out.println("Please enter your city's name:");
        c = sc.nextLine();
        System.out.println("Please enter your province's name:");
        pr = sc.nextLine();
        System.out.println("Please enter your postal-code:");
        pc = sc.nextLine();
        System.out.println("Your in information:");
        System.out.println("Name: " + n + "  Address: " + a +"  City: " + c + "  Province: " + pr + "  Postal code: " + pc);
    }
}