package np.edu.nast.thread;

public class ParaWord extends Thread {
    private String[] words;

    public ParaWord(String[] words) {
        this.words = words;
    }

    @Override
    public void run() {
        for (String w : words) {
            System.out.println(w);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
