package np.edu.nast.simple;

public class Child extends Parent{

    Child(){
        super();

    }
    Child(String name, String message){
        super(message);
        System.out.println(name);//sunil
    }
    void childMethod(){
        System.out.println("I am inside child!");
    }
}
