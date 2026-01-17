package oop.problems.Question01;


public class Truck extends Vehicle{
    int weight;

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            double discount = 0.10;
            double newPrice = regularPrice - (regularPrice * discount);
            return newPrice;
        } else {
            return regularPrice;
        }
    } 
}
