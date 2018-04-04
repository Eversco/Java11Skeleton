import java.util.Scanner;
public class RectangleArea{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x, xx, y, yy, w, h, a; // a variable equal first coordinate and two variables equal second coordinate
        System.out.println("Computer Aided Design Program");
        System.out.println("First corner X coordinate: ");
        x = sc.nextInt();
        System.out.println("First corner Y coordinate: ");
        y = sc.nextInt();
        System.out.println("Second corner X coordinate: ");
        xx = sc.nextInt();
        System.out.println("Second corner Y coordinate: ");
        yy = sc.nextInt();
        if(xx < x) { // comparing which one is bigger in order to find appropriate one to subtract another for the distance.
            w = x - xx; // the appropriate distance
        } else if (x < xx) {
            w = xx - x; // the approproate distance
        }
        else {
            w = 0;
        }
        if(yy < y) {// comparing which one is bigger in order to find appropriate one to subtract another for the distance.
            h = y - yy;// the appropriate distance
        } else if (y < yy) {
            h = yy - y; // the appropriate distance
        }
        else {
            h = 0;
        }
        a = w * h; // the area
        while (a != 0) { //repeating question. If area equals 0, the program ends
            if (x == xx || y == yy){ //when first and second coordinate equal each other, it is not a rectangle.
            w = 0;
            h = 0;
            a = 0;
        }
        System.out.println("Width: " + w + " Height: " + h + " Area: " + a);
        System.out.println("First corner X coordinate: ");
        x = sc.nextInt();
        System.out.println("First corner Y coordinate: ");
        y = sc.nextInt();
        System.out.println("Second corner X coordinate: ");
        xx = sc.nextInt();
        System.out.println("Second corner Y coordinate: ");
        yy = sc.nextInt();
                if(xx < x) {
            w = x - xx;
        } else if (x < xx) {
            w = xx - x;
        }
        else {
            w = 0;
        }
        if(yy < y) {
            h = y - yy;
        } else if (y < yy) {
            h = yy - y;
        }
        else {
            h = 0;
        }
        a = w * h;
        }
        System.out.println("Uh oh you lost.");
    }
}