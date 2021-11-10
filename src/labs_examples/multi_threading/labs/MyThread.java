package labs_examples.multi_threading.labs;

public class MyThread extends Thread {

    public static int count = 0;

    public MyThread(String name){
        super(name);
        this.start();
    }

    public void run(){

        System.out.println(getName() + " thread is starting");
        try {Thread.sleep(500);
        } catch (InterruptedException exc){
            exc.printStackTrace();
        }
        incrementCount();
        System.out.println(getName() + " thread is done");
    }

    public void incrementCount(){

            while (count < 10) {
                System.out.println(Thread.currentThread().getName() + " - " + count);
                count++;
        }
    }
}
