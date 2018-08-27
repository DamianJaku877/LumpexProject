package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        RawText rawText = new RawText();

        ConsoleFormatText consoleFormatText = new ConsoleFormatText(rawText);
        HtmlFormatText htmlFormatText = new HtmlFormatText(rawText);

        System.out.println("\nRaw text:");
        System.out.println(rawText.getText());
        System.out.println("\nConsolFormatText: ");
        System.out.println(consoleFormatText.getText());
        System.out.println("\nHtmlFormatText: ");
        System.out.println(htmlFormatText.getText());
    }
}
