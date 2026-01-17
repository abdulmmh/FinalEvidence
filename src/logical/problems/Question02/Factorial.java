package logical.problems.Question02;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int num = input.nextInt();
        long factorial = 1;
        int count = 1;
        while(count <= num){
            factorial *= count;
            count++;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
