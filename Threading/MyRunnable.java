public class MyRunnable implements Runnable{

    public void run(){
        try{
        for(int i=1;i<6;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+i);
            Thread.sleep(1000);
        }
    }catch(InterruptedException e){
        System.out.println(e) ;
    }
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Runnable my=new MyRunnable();
        Thread t1=new Thread(my,"t1");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2=new Thread(my,"t2");
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3=new Thread(my,"t3");
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

}