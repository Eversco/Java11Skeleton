import java.util.Scanner;
public class CheckerChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double checkingAccount, savingAccount;
        System.out.println("Enter the savings of your checking account");
        checkingAccount = sc.nextDouble();
        System.out.println("Enter the savings of your saving account");
        savingAccount = sc.nextDouble();
        if (checkingAccount <1000 || savingAccount < 1500) {
            System.out.println("Your checks will have service charge");
        }
        else {
            System.out.println("No service charge");
        }
    }
}