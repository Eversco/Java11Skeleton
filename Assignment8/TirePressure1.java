import java.util.Scanner;
public class TirePressure1 {
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
        if (frontRight != frontLeft || rearRight != rearLeft) {
            System.out.println("The pressures are not balance");
        }
        else {
            System.out.println("The inflation is ok");
        }
    }
}