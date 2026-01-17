package oop.problems.Question01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Truck truck = new Truck();
        System.out.print("Enter a integer value for truck's speed: ");
        truck.speed = input.nextInt();
        
        System.out.print("Enter a double value for truck's regular price: ");
        truck.regularPrice = input.nextDouble();
        
        System.out.print("Enter a string for truck's color: ");
        truck.color = input.next();
        
        System.out.print("Enter a integer value for truck's weight: ");
        truck.weight = input.nextInt();
        
        System.out.println("Speed " + truck.speed + " km/h, "+ 
                       truck.weight + " kg, "+
                        truck.color + " color truck's \n=>regular price"
                        + " is " + truck.regularPrice);
        
        System.out.println("=> Selling price " + truck.getSalePrice());
         input.close();
    }
}
