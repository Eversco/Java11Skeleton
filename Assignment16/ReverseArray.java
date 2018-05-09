class ReverseArray {
    public static void main(String[] args) {
        int[] val = { 0, 1, 2, 3 };
        int temp;

        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        temp = val[3]; // keeps number
        val[3] = val[0];// switch place
        val[0] = temp;// keeps value
        
        temp = val[1];// same thing
        val[1] = val[2];
        val[2] = temp;

        System.out.println("Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}