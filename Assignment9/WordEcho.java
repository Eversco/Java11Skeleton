import java.util.Scanner;

class WordEcho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count; // The amount of the string

        String inputString;// The variable of the word you are putting in

        int times; // the limit of count

        System.out.println("Enter word:");

        inputString = scan.nextLine(); // putting string

        times = inputString.length();

        count = 1;

        while (count<=times) {
            System.out.println(inputString);
            count = count + 1; // Increasing your word
        }
    }
}