package logical.problems.Question08;

import java.util.Scanner;


public class ConditionalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers (negative number to stop): ");
        int total = 0;
        int num;
        do{
             num = input.nextInt();
            if (num < 0) {
                break;
            } else{
                total += num;
            }
        }while(num >= 0);
        
        System.out.println("Total Sum = " + total);
        input.close();
    }
}
