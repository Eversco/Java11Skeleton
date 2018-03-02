import java.util.Scanner;
class BrickDrop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g = 32.174;
        double d, t;
        System.out.println("Enter the time taken to for the brick to touch the ground");
        t = sc.nextDouble();
        d = (1.0/2.0) * g * (t * t);
        System.out.println("The distance between the brick and the ground was " + d + " feet");
}
}