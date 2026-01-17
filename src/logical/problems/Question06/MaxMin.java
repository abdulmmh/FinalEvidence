package logical.problems.Question06;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many? ");
        int n = input.nextInt();
        
        
        System.out.print("Enter your numbers: ");
        int num = input.nextInt();
        int max = num;
        int min= num;

        for (int i = 0; i < n - 1; i++) {
             num = input.nextInt();
            
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        input.close();
    }
}
