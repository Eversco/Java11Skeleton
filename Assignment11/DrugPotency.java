import java.util.Scanner;
public class DrugPotency {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double eff; //Effectiveness
        int month;
        System.out.println("Enter current effectiveness percent: ");
        eff = sc.nextDouble(); //Value given by users
        month = 1;
        if (eff > 100){ // Stops the program when enter more than 100.
            System.out.println("Error, the percentage cannot exceed more than 100");
        }
        while (eff >= 50 && eff <=100) { // When effectiveness is under 50 it will stop. The given percent cannot exceed 100
            eff = eff - (eff * 0.04);// effective decreased by its 4%
            System.out.println("Month "+month+"  Effectiveness: "+eff);
            month = month+1; // Increase number of month
        }
    }
}