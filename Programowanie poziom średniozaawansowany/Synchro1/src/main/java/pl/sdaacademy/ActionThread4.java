package pl.sdaacademy;

public class ActionThread4 extends Thread {

    Table t;

    ActionThread4(Table t){
        this.t=t;
    }

    public void run(){
        t.printTable(1000);
    }
}
