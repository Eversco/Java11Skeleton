import java.util.Scanner;
class AnimalFeatures {

    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String name;
   String Animal;
   String feature;
   System.out.println("Enter the name of a person");
   name = scan.nextLine();
   System.out.println("Enter a feature");
   feature = scan.nextLine();
   System.out.println("Enter an animal");
   Animal = scan.nextLine();
   
   System.out.format("%s has a %s like a %s", name, feature, Animal);
    
    }
}