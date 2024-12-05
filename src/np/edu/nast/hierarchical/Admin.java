package np.edu.nast.hierarchical;

public class Admin extends Person{
    double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public static void main(String[] args) {
        Admin a = new Admin();
        a.setData("Dil",21);
        a.setBonus(500000);

        a.displayData();
        System.out.println(a.getBonus());
    }
}
