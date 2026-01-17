package logical.problems.Question01;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many terms do you wanna print: ");
        int n = input.nextInt();
        int[] fibonacci = new int[n];
        
        if (n < 1){ 
            System.out.println("Wrong input!");
            return;
        }
        if (n >= 1) fibonacci[0] = 0;
        if (n >= 2) fibonacci[1] = 1;  
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        System.out.println("Fibonacci series :" + Arrays.toString(fibonacci));
        input.close();
    }
}
