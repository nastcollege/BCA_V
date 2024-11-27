public class OddEvenDemo {
    public static void main(String[] args) {
        new OddNumber().start();
        new Thread(new EvenNumbers()).start();
    }
}
