package com.microsoft.demo;

public class Demo {
    
    public String password = "Hello";
    public String SQLQ = "Select * from mytable where name=?";
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I ama covered");
            return;
        }

        System.out.println("I am not covered");
    }
}
