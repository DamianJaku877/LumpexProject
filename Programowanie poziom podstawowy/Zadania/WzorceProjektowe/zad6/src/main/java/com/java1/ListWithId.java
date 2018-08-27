package com.java1;

import java.util.HashMap;

public class ListWithId<V> extends HashMap<Integer,V> {

    private int position = 1;
    private String obj = "name";

    public void add(V obj){
        put(position, obj);
        position++;
    }
}
