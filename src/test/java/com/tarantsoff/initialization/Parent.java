package com.tarantsoff.initialization;

public class Parent {

    protected  String prot;

    static {
        System.out.println("Parent.static initializer");
    }

    {
        System.out.println("Parent.instance initializer");
    }

/*
    public Parent(String pr) {
        System.out.println("Parent.Parent(pr)");
    }
*/
}
