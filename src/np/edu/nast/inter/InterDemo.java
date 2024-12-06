package np.edu.nast.inter;

public class InterDemo {


    public static void main(String[] args) {
        Car c = new Car();
        c.on();
        c.start();
        c.run();
        c.off();

        MoterCycle cycle= new MoterCycle();
        cycle.on();
        cycle.start();
        cycle.run();
        cycle.off();
    }
}
