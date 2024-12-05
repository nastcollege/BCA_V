package np.edu.nast.inheritance;

public class Child extends Parent {
   String email;

   void setEmail(String email){
       this.email=email;
   }

    public String getEmail() {
        return email;
    }

    String getDefaultEmail(){
       return "sunil@nast.edu.np";
    }

    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.getDefaultName());
        System.out.println(c.getDefaultEmail());

        c.setName("Another Name");
        c.setEmail("another@gmail.com");

        System.out.println(c.getName());
        System.out.println(c.getEmail());
    }
}
