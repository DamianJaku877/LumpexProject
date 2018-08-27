package pl.sdaacademy;

public class ActionThread1 extends Thread {

    Table t;

    ActionThread1(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(1);
    }
}
