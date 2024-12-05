package np.edu.nast.hierarchical;

public class Student extends  Person{
    double fee;

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Sudeep",20);
        s.setFee(30000);

        s.displayData();
        System.out.println("Fee: "+s.getFee());
    }
}
