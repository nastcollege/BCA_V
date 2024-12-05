package np.edu.nast.thread;

public class EvenNumbers implements  Runnable{
    @Override
    public void run() {
        for(int i=100;i>0;i-=2){
            System.out.println("\tE:"+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
