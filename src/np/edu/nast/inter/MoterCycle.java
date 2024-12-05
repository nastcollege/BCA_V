package np.edu.nast.inter;

public class MoterCycle implements Engine{
    @Override
    public void on() {
        System.out.println("MoterCycle On");
    }

    @Override
    public void off() {
        System.out.println("MoterCycle off");
    }

    @Override
    public void start() {
        System.out.println("MoterCycle start");
    }

    @Override
    public void run() {
        System.out.println("MoterCycle run");
    }
}
