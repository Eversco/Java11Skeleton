import java.io.*;

class ReverserVersion1 {

    public static void main(String[] args) throws IOException {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int max = 0;
        while (max < data.length){// finds out the biggest value
            max++;
        }
        // reverse the data
        for (int j = 0; j < data.length; j++) {// the biggest value subtracts current data and plus 1 in order to reverse
         int addTo = max - data[j] + 1;
         data[j] = addTo;   
        }
        
        // write out the new data
        for (int j = 0; j < data.length; j++) {
         System.out.println(data[j]);
        }

    }
}