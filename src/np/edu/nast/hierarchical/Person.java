package np.edu.nast.hierarchical;

public class Person {
    private String name;
    private int age;

    void setData(String name, int age){
        this.name=name;
        this.age=age;
    }

    void displayData(){
        System.out.println(name + " "+age);
    }
}
