package np.edu.nast.hierarchical;

public class Teacher extends Person{
    double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setData("Sunil Bahadur Bist",35);
        t.setSalary(50000);
        t.displayData();
        System.out.println(" Having salary: "+t.getSalary());
    }
}
