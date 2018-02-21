import java.util.Scanner;
class YearOFAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long year, DaysInAYear, DaysBeenBorn;
        DaysInAYear = 365;
        System.out.println("How old are you?:");
        year = scan.nextInt();

        DaysBeenBorn = year * DaysInAYear;

        System.out.println ( "You are approximately " + DaysBeenBorn + " days old");
    }
}