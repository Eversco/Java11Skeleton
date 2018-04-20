import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int age, iq, gender, height;
        int totalPeople = 0;
        int totalFemale = 0;
        int totalMale = 0;
        int tallSmartDudes = 0; // Tall smart dudes who get all the chicks
        int totalIQ = 0;
        int totalHeight = 0;
        int youngestAge = Integer.MAX_VALUE;
        int oldestAge = 0;

         while (scan.hasNextInt()) {
         age = scan.nextInt();
         if (age == -1) { // if enter -1 quit program
             break;
            }
            iq = scan.nextInt();
            gender = scan.nextInt();
            height = scan.nextInt();
            if (age > oldestAge){ // if any age is older than the current oldest, the oldest equals that age
                oldestAge = age;
            }
            if (age < youngestAge){// if any age is younger than the current youngest, the youngest equals that age
                youngestAge = age;
            }
            if (gender == 1) { //more males as much the user enters
                totalMale++;
                if (height > 72 && iq > 140){ // if any people taller than 6ft and higher than IQ 140, tall smart dudes confirmed
                    tallSmartDudes++;
                }
            } else if (gender == 0) {
                totalFemale++;
            }
            totalIQ += iq; // adding all IQs
            totalHeight += height;// adding all height
            totalPeople++;
         System.out.println("");
        }
        int averageIQ = totalIQ / totalPeople; // making out average of IQ
        int averageHeight = totalHeight / totalPeople;// making out the average of height
        System.out.println("Total People: " + totalPeople);
        System.out.println("Males: " + totalMale);
        System.out.println("Females: " + totalFemale);
        System.out.println("Males over 6ft and greater than IQ 140: " + tallSmartDudes);
        System.out.println("Average IQ: " + averageIQ);
        System.out.println("Average Height: " + averageHeight);
        System.out.println("Oldest: " + oldestAge);
        System.out.println("Youngest: " + youngestAge);
        scan.close();
    }
}