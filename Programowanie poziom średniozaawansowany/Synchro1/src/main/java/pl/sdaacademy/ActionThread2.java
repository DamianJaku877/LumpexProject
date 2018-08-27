package pl.sdaacademy;

public class ActionThread2 extends Thread {

    Table t;

    ActionThread2(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(10);
    }
}
