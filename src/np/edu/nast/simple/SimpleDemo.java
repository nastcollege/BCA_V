package np.edu.nast.simple;

public class SimpleDemo {
    public static void main(String[] args) {
        //creating an object
        Child ko=new Child();
        ko.childMethod();
        ko.parentMethod();


        Child c=new Child("Sunil","Tomorrow is welcome program please attend");
        c.childMethod();
        c.parentMethod();
    }
}
