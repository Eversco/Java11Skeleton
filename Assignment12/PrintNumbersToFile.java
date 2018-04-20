import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int age, iq, gender, height;
        File file = new File("data.txt"); //making new file
        PrintStream print = new PrintStream(file);// adding dqta into file
        age = 0;
        while (age != -1) {
            System.out.print("(Enter -1 into age to exit): ");
            System.out.println("Enter the age: ");
            age = scan.nextInt(); // enter age
            if (age == -1){ // if age = -1 then program ends
                break;
            }
            print.println(age); // print out age
            System.out.println("Enter the IQ: ");
            iq = scan.nextInt();
            print.println(iq);
            System.out.println("Enter Gender(1 for male, 0 for female):");
            gender = scan.nextInt();
            if (gender == 1){ // enter 1 print out male
            print.println(1);
        }
        else if (gender == 0) { // if enter 0 but actually doesn't matter, prints out female
            print.println(0);
        }
        System.out.println("Enter height:");
        height = scan.nextInt();
        print.println(height);
        }

        print.close();
    }
}