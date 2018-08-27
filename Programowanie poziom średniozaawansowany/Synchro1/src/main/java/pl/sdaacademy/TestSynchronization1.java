package pl.sdaacademy;

public class TestSynchronization1 {

    public static void main(String args[]){
        Table obj = new Table();
        ActionThread1 t1 = new ActionThread1(obj);
        ActionThread2 t2 = new ActionThread2(obj);
        ActionThread3 t3 = new ActionThread3(obj);
        ActionThread4 t4 = new ActionThread4(obj);

        t1.run();
        t2.run();
        t3.run();
        t4.run();
    }
}
