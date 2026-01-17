package oop.problems.Question02;


public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();
        
        Child c = new Child();
        c.childMethod();
        c.parentMethod();
    }
}
