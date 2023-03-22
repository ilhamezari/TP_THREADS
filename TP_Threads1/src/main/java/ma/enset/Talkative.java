package ma.enset;

public class Talkative implements Runnable {
    private static int param1;

    public Talkative(int param1) {
     Talkative.param1=param1;
    }
public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
        Thread thread = new Thread(new Talkative(i));
        thread.setName("Thread"+i);
        thread.start();
    }
}
    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i+" ["+param1+"]");
        }

    }
}
