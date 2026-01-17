package logical.problems.Question11;

import java.util.Scanner;


public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter student's marks: ");
        int marks = input.nextInt();
        
        if (marks >= 90) {
            System.out.println("You got A+");
        } else if (marks >= 70) {
            System.out.println("You got A");
        } else if (marks >= 60) {
            System.out.println("You got B");
        } else {
            System.out.println("You failed!");
        }   
        input.close();
    }
}
