public class Question5 {
    public static void main(String[] args) {
        double quantity = 25;
        double price = 1.47;
        double total = 0;
        for (int i = 0; i < quantity; i++) {
            total = price + total;
            System.out.println (price + total);

        }
        System.out.println ( "dollar");
    }
}