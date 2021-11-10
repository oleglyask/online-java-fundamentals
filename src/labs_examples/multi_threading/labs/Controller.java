package labs_examples.multi_threading.labs;



public class Controller{

    public static void main(String[] args) {

        System.out.println("main starting");
        //new Thread(new MyRunnable(), "MyRunnable").start();
        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");
        System.out.println("main end");

    }


}

