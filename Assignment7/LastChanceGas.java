import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tankCapacity, gageReading, milesPergallon, total;
        System.out.println("Please enter the number of the Tank Capacity.");
        tankCapacity = sc.nextInt();
        System.out.println("Please enter the number of the Gage reading.");
        gageReading = sc.nextInt();
        System.out.println("Please enter the number of the Miles per gallon.");
        milesPergallon = sc.nextInt();
        total = (((gageReading/100) * tankCapacity) * milesPergallon);
        if (total <= 200) {
            System.out.println("You can go " + total + " miles.");
            System.out.println("You do not have have enough gas to reach the the gas station.");
    }
    if (total >= 200) {
        System.out.println("You can go " + total + " miles.");
        System.out.println("You have enough gas!");
    }
}
}