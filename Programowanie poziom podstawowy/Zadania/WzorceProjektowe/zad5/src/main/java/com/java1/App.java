package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");

        File file1 = new File("1");
        File file2 = new File("2");
        File file3 = new File("3");
        File file4 = new File("4");

        folder1.add(folder2);
        folder1.add(folder3);

        folder3.add(file1);
        folder3.add(file2);

        folder2.add(new File("x"));
        folder2.add(new File("x"));
        System.out.println();


    }
}
