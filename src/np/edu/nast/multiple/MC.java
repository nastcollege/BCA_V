package np.edu.nast.multiple;

public class MC extends FP implements MP{
    @Override
    public void mp() {
        System.out.println("Male parent");
    }

    @Override
    public void mpp() {
        System.out.println("Male parent Pro");
    }

    public static void main(String[] args) {
        MC maleChild = new MC();
        maleChild.mp();
        maleChild.fp();
    }
}
