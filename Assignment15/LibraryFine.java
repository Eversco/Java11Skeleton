import java.util.Scanner;

class LibraryFine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int daysod;
        char fich;
        while (true){
            double fineV; // the value
            System.out.println("How many days overdue. Enter 0 to exit.");
            daysod = sc.nextInt(); // days
            sc.nextLine();
            if (daysod == 0){
                break;
            }
            System.out.println("Enter the fine grade:");
            String finestr = sc.nextLine();
            finestr = finestr.trim(); 
            finestr = finestr.toUpperCase(); // Set upper case
            fich = finestr.charAt(0);
            switch (fich){ // each grade
                case 'A':
                    fineV = 0.10;
                    break;
                case 'B':
                    fineV = 0.25;
                    break;
                case 'C':
                    fineV = 0.50;
                    break;
                case 'D':
                    fineV = 1.00;
                    break;
                case 'E':
                    fineV = 2.00;
                    break;
                case 'F':
                    fineV = 5.00;
                    break;
                default:
                    System.out.println("Invalid Fine Grade");
                    continue;
            }
            System.out.println("Total: " + (fineV * daysod)); // total
        }
    }
}