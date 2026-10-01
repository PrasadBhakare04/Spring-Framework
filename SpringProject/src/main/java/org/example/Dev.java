package org.example;

public class Dev {


//    private Laptop laptop;
    private Computer com;

    public void setCom(Computer com){
        this.com = com;
    }

//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Dev(){
        System.out.println("Object of Dev created");
    }

    public void compile(){
//        System.out.println("dev is using laptop version: "+ laptop.version);
        System.out.println("Developing the code");
        com.compile();
    }
}
