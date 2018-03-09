import java.util.Scanner;
public class TirePressure2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int frontRight, frontLeft, rearRight, rearLeft;
        System.out.println("Enter the pressure of the right front pressure");
        frontRight = sc.nextInt();
        System.out.println("Enter the pressure of the left front pressure");
        frontLeft = sc.nextInt();
        System.out.println("Enter the pressure of the rear right");
        rearRight = sc.nextInt();
        System.out.println("Enter the pressure of the rearLeft");
        rearLeft = sc.nextInt();
        if (rearLeft > 45 || rearLeft < 35) {
            System.out.println("The inflation for left rear is BAD");
        }
        if (rearRight > 45 || rearRight < 35) {
            System.out.println("The inflation for right rear is BAD");
        }
        if (frontRight > 45 || frontRight < 35) {
            System.out.println("The inflation for right front is BAD");
        }
        if (frontLeft > 45 || frontLeft < 35) {
            System.out.println("The inflation for left front is BAD");
        }
        if (frontRight != frontLeft || rearRight != rearLeft) {
            System.out.println("The pressures are not balance");
        }
        
        else {
            System.out.println("The inflation is ok");
        }
    }
}