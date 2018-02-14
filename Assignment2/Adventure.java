import java.util.Scanner;

public class Adventure
{
public static String playerName;
public static Scanner sc;
public static boolean hasKey;
public static boolean portalEntered;

    public static void main(String[] args) {
        String playerName;
        String playerIntension;
        String playerResponse;
        String playerAnswer;
        String playerDescription;
        String playerDescription2;
        
        Scanner sc = new Scanner(System.in);
        hasKey = false;
        portalEntered = false;
        System.out.println("Greeting Adventurer! Please enter your name: ");
        
        playerName = sc.nextLine();
        
        if (playerName.equals("Elijah")){
            System.out.println("You are the enemy of our lord! You are banished to the underworld!");
            System.out.println("*You have been banished to the underworld!*");
        }
        else {
            System.out.println("Ah I see your name is " + playerName + ". Interesting...");
            System.out.println("Welcome to the Skyrome!");
            System.out.println("So what are you doing?");
        
        playerIntension = sc.nextLine();
        
        if (playerIntension.equals("Milking your cow")) {
            System.out.println("How dare you! I will curse you to the deepest ground and your descendants you will all be failures!");
            System.out.println("Game Over");
        }
        else {
            System.out.println(" Really? It sounds like you are very tired.");
            System.out.println("May I offer you some foods or drinks?");
            
            playerResponse = sc.nextLine();
            
            if (playerResponse.equals("Yes, I would like to have some drink")) {
                System.out.println("Very well, let me offer you some tea then.");
                System.out.println("*You have obtained a cup of tea*");
        }
         if (playerResponse.equals("Yes, I would like to have some food")) {
                System.out.println("Very well, let me offer you some bread then.");
                System.out.println("*You have obtained a bread*");
        }
        if (playerResponse.equals("No")) {
                System.out.println("Very well.");
                System.out.println("*He hands you nothing.*");
        }
        else {
            System.out.println("Okay.");
        }
        System.out.println("So tell me. Where do you come from?");
        
        playerAnswer = sc.nextLine();
        
        if (playerAnswer.equals("Nowhere")) {
            System.out.println("Nowhere? You must be from somewhere. Perhaps you have seen it, but you have never known it.");
        }
        else {
            System.out.println(playerAnswer + "? I have never heard of the place before. Tell me about it.");
            
            playerDescription = sc.nextLine();
            
            if (playerDescription.equals("It's a weird place")) {
                System.out.println("How is it weird?");
                playerDescription2 = sc.nextLine();
                if(playerDescription2.equals("There are a lot of druggies")) {
                    System.out.println("Eww. That's not pleasant.");
        }
        if (playerDescription2.equals("People are crazy there")) {
            System.out.println("Well what do you know! Everyone is crazy!");
        }
        else {
            System.out.println("Well, That sounds funny.");
    }
    
}
else {
        System.out.println("Well, that is certainly interesting.");
    }
}
}
}
StartRoom();
}
     public static void StartRoom() {
         System.out.println("You shall be the chosen one who will lead Skyrome to the destined era");
         System.out.println("But first you got to pack your stuff up.");
         System.out.println("Enter 1 to get your supplies.");
         System.out.println("Enter 2 to enter to the portal of the destiny.");
         

         String roomChoice = sc.nextLine();
 
         if (!hasKey) {
         if (roomChoice.equals("1")){
             System.out.println("You have gathered your supplies.");
             hasKey = true;
}
else if (roomChoice.equals("2")) {
    System.out.println("You are now entered into the Portal of Destiny.");
    portalEntered = true;
}
}
else
{
    if (roomChoice.equals("2")) {
        System.out.println("You are now entered into the Portal of Destiny.");
}
}
}
}