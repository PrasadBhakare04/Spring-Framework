package org.example;

public class Laptop {

    public int version;
    public void setVersion(int version) {
        this.version = version;
    }


    public Laptop(){
        System.out.println("Object of Laptop created");
    }

//    public Laptop(int version){
//        this.version = version;
//    }

    public void compile(){
        System.out.println("Compiling on laptop");
    }
}
