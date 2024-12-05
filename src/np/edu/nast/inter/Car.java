package np.edu.nast.inter;

public class Car implements Engine{
    @Override
    public void on() {
        System.out.println("Car on");
    }

    @Override
    public void off() {
        System.out.println("Car off");
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }

    @Override
    public void run() {
        System.out.println("Car run");
    }
}
