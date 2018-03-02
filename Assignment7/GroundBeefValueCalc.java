import java.util.Scanner;

public class GroundBeefValueCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pricePerPackageA, pricePerPackageB, leanPerPackageA, leanPerPackageB, leanPriceA, leanPriceB;
        System.out.println("Enter the price per pound for Package A");
        pricePerPackageA = sc.nextDouble();
        System.out.println("Enter lean percent of Package A");
        leanPerPackageA = sc.nextDouble();
        System.out.println("Enter the price per pound for Package B");
        pricePerPackageB = sc.nextDouble();
        System.out.println("Enter lean percent of Package B");
        leanPerPackageB = sc.nextDouble(); 
        leanPriceA = (pricePerPackageA * 100) / leanPerPackageA;
        leanPriceB = (pricePerPackageB * 100) / leanPerPackageB;
        System.out.println("The cost of lean per pound of Package A: " + leanPriceA);
        System.out.println("The cost of lean per pound of Package B: " + leanPriceB);
        if (leanPriceA > leanPriceB) {
            System.out.println("Buy Package B! It has the best value!");
        } 
        if (leanPriceA < leanPriceB) {
            System.out.println("Buy A!");
        }
        else {
            System.out.println("Error, the values are equal.");
        }
    }
}