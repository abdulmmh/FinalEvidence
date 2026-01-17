# Java OOP Problems

## Questions

1. a) Create a super class called Vehicle. The Vehicle class has the following 
        Fields and methods.
            int speed;
            double regularPrice;
            String color;
            double getSalePrice();

  b)Create a sub class of Vehicle class and name it as Truck.
     The Truck class has the following fields and methods.
        int weight;
        -Now override the double getSalePrice() method from its super class and
            apply the following logic- If weight>2000, 10% discount. 
            Otherwise no discount on regularPrice.

2. Create a class with a method that prints "This is parent class and 
    its subclass with another method that prints "This is child class
     Now, create an object for each of the class and call
        1. Method of parent class by object of parent class
        2. Method of child class by object of child class
        3. Method of parent class by object of child class

3. a)Make the instance variables private so that they cannot be accessed 
    directly from outside the class. You can only set and get values of 
        these variables through the methods of the class.
   b) Have getter and setter methods in the class to set and get the 
        values of the fields.

    (Inheritance with method overriding)
4. Create a class Vehicle and create a method name vehicleRun, 
    create another class name Car and inherit the vehicle class
        Override the vehicleRun method in the Car class and print 
        the both methods.