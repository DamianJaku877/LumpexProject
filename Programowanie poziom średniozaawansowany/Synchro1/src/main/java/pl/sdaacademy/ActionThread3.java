package pl.sdaacademy;

public class ActionThread3 extends Thread {

    Table t;

    ActionThread3(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(100);
    }
}
