public class OddNumber extends Thread{
    @Override
    public void run() {
        for(int i= 51;i<100;i+=2){
            System.out.println("O:"+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
