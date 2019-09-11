package com.tarantsoff.initialization;

public class Child extends Parent {

    private volatile String sss;

    public Child() {

        System.out.println("Child.Child");
    }

    public Child(String sss) {
        //super();
        this();
        this.sss = sss;
        System.out.println("Child.Child(sss)");
    }

    {
        sss = "111";

        System.out.println("Child.instance initializer");
    }

    static{
        new Parent();
        System.out.println("Child.static initializer");
    }

    public static void main(String[] args) {
        System.out.println("Child.main");
        new Child("45");
    }
}
