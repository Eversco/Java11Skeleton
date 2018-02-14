public class Question6 {
        public static void main(String[] args) {
            double Velocity = 0;
            double gravity = 9.81;
        for (int i = 0; i < 10; i++) {
            Velocity = gravity + Velocity;
            System.out.println(Velocity);
        }
        System.out.println ( "Calclated");
    }
}