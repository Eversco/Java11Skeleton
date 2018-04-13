import java.util.Scanner;
public class ParcelShipping2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '-1' to cotinue and '-2' to exit");
          while (true){ 
            double volume, height, width, depth, weight;
            int exit;
            double basicCharge = 5;
            double totalCharge = basicCharge;
            double overSizeCharge = 0;
            double overWeightCharge = 0;
            System.out.println("Enter height: ");
            height = sc.nextDouble();
            System.out.println("Enter width: ");
            width = sc.nextDouble();
            System.out.println("Enter depth: ");
            depth = sc.nextDouble();
            System.out.println("Enter weight: ");
            weight = sc.nextDouble();
            volume = height * width * depth;
            if (volume > 5) {
                overSizeCharge += 20;
            }
            if (weight > 5) {
                overWeightCharge += 10;
            }
            totalCharge = overSizeCharge + overSizeCharge;
            System.out.println("Over-weight Charge: " + overWeightCharge);
            System.out.println("Over-Size Charge: " + overSizeCharge);
            System.out.println("Total: " + totalCharge);
            System.out.println("Do you want to exit?");
            exit = sc.nextInt();
            if (exit == -2){
                System.out.println("Bye");
                break;
            }
        }
    }
}
