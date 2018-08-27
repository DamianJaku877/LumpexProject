package com.java1;

public class HtmlFormatText implements Decorator {
    Decorator decoratorObject;

    public HtmlFormatText(Decorator decoratorObject){
        this.decoratorObject = decoratorObject;
    }
    @Override
    public String getText() {
        return "33333; " + decoratorObject.getText() + " 444444;";
    }
}
