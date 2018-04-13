import java.util.Scanner;
public class ParcelShipping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            double volume, height, width, depth, weight;
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
    }
}