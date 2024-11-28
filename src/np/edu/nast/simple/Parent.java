package np.edu.nast.simple;

public class Parent {
String message;
    Parent(){
        message="hello";
    }

    Parent(String message){
        this.message=message;
    }
   void parentMethod(){
        System.out.println("I am inside parent: "+message);
    }
}
