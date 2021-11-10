package labs_examples.multi_threading.labs;

public class MyRunnable implements Runnable {


        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + " is starting");
            try {Thread.sleep(500);
            } catch (InterruptedException exc){
                exc.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is done");
        }
}
