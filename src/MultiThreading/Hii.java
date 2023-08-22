package MultiThreading;

public class Hii extends Thread{
    public void run(){

        System.out.println(Thread.currentThread().getName());

        for (int i=0;i<5;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class Hello implements Runnable{
    public void run(){

//        System.out.println(Thread.currentThread().getName());

        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class Test{
    public static void main(String[] args) {

       System.out.println(Thread.currentThread().getName());

        Hii hii = new Hii();
        hii.start();
        hii.setPriority(1);

        Hello hello = new Hello();
        Thread t1 =new Thread(hello);
        t1.start();
        t1.setPriority(10);
    }
}

//new - when you create object of thread and before invocation of start
//runnable - after start method invoke but thread scheduler is not selected as running
//running -
//blocked/wiating -
//Terminated/death -
