package com.java1;

public class ConsoleFormatText implements Decorator {
    Decorator decoratorObject;

    public ConsoleFormatText(Decorator decoratorObject){
        this.decoratorObject = decoratorObject;
    }
    @Override
    public String getText() {
        return "~222222: " + decoratorObject.getText();
    }
}
