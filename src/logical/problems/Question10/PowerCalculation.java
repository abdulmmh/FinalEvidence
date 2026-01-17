package logical.problems.Question10;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int total = 1;
        
        System.out.print("Enter a number for power: ");
        int power = input.nextInt();
        
        for (int i = 0; i < power; i++) {
            total *= number;
        }
                
        System.out.println("Power of " + number +  " is " + total );
        input.close();
    }
}
