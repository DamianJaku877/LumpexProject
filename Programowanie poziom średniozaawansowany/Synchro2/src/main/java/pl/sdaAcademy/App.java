package pl.sdaAcademy;

public class App 
{
    public static void main( String[] args )
    {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";

        Thread t1 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource1");
                    try{Thread.sleep(100);} catch (Exception e){}
                    synchronized (resource2){
                        System.out.println("Thread 1: locked resource2");
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource2");
                    try{Thread.sleep(100);}catch(Exception e){}
                    synchronized (resource1){
                        System.out.println("Thread 2: locked resource1");
                    }
                }
            }
        };
        t1.run();
        t2.run();
    }
}
