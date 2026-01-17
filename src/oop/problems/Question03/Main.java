package oop.problems.Question03;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setBase(4);
        t.setHeight(5);
        
        int base = t.getBase();
        int height = t.getHeight();
        
        int area = (base * height) / 2;
        
        System.out.println("Triangle's area is " + area);
        
    }
}
