import java.lang.*;

class MyThread extends Thread{
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(ct.getName() + " is iterating " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(ct.getName() + " ID: " + getId());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); 
        t1.setName("t1");
        t1.setPriority(Thread.MAX_PRIORITY);

        MyThread t2 = new MyThread(); 
        t2.setName("t2");
        t2.setPriority(Thread.MIN_PRIORITY);

        MyThread t3 = new MyThread();
        t3.setName("t3");
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start(); 
        t2.start();
        t3.start();
    }
}
