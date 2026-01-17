package logical.problems.Question03;

import java.util.Scanner;


public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = input.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number +" is not a prime number.");
        }
        input.close();
    }
    
    static boolean isPrime(int num){
            if (num <= 1) {
                return false;
            }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            } 
        }
        return true;        
    }
}
