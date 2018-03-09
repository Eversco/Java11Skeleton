import java.util.Scanner;
public class FantasyGame{
    public static void main(String[] args){
        String playerName;
        int strength, health, luck;
        Scanner sc = new Scanner(System.in);
        System.out.println("~>)Enter the name of your character(<~");
        playerName = sc.nextLine();
        System.out.println("~>)Enter the suitable strength for you. Remember that all points cannot exceed 15 after adding together.(<~");
        strength = sc.nextInt();
        System.out.println("~>)Enter the suitable health for you(<~");
        health = sc.nextInt();
        System.out.println("~>)Enter the suitable luck for you(<~");
        luck = sc.nextInt();
        if ((strength + health + luck) > 15) {
            System.out.println("You have given your character too many point!");
            strength = 5;
            health = 5;
            luck = 5;
            System.out.format(playerName + ", Strength: %s, Health: %s, Luck: %s", strength, health, luck);
        }else {
         System.out.format(playerName + ", Strength: %s, Health: %s, Luck: %s", strength, health, luck);   
        }
    }
}