import java.util.Scanner;
public class WordDots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String FirstWord, SecondWord; // variable of first word and second word
        int firstwordlength, secondwordlength; // varaible for the length
        int o = 0; // Variable of counting
        System.out.println("Enter the first word: ");
        FirstWord = sc.nextLine();
        firstwordlength = FirstWord.length(); // the number into length
        System.out.println("Enter the second word: ");
        SecondWord = sc.nextLine();
        secondwordlength = SecondWord.length();// the number into length
        System.out.print(FirstWord);
        while(o<30-(firstwordlength+secondwordlength)){ // looping the dot
            System.out.print(".");
            o = o + 1;
        }
        System.out.print(SecondWord);
    }
}
