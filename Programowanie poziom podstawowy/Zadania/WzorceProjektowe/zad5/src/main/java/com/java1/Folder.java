package com.java1;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {

    private String name;
    private List<Component> components = new ArrayList<Component>();
    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Component component){
        components.add(component);
    }
}
