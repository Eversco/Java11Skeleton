import java.io.*;

class ThreeSums {

    public static void main(String[] args) throws IOException {
        int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };

        // declare and initialize three sums
        int evenSum = 0;
        int oddSum = 0;
        int totalSum = 0;
        // compute the sums
        for (int index = 0; index < data.length; index++) {
            if (data[index] % 2 == 0){ // only adding even number
                evenSum += data[index];
            } else {// only adding odd
                oddSum += data[index];
            }
        }
        totalSum = evenSum + oddSum;
        // write out the three sums
        System.out.println("Even: " + evenSum);
        System.out.println("Odd: " + oddSum);
        System.out.println("Total: " + totalSum);
    }
}