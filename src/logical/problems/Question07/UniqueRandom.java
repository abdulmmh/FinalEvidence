package logical.problems.Question07;

import java.util.Arrays;


public class UniqueRandom {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        int count = 0;
        
        while (count < 10) {            
            int num = (int)(Math.random() * 100);
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (randomNumbers[i] == num) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                randomNumbers[count++] = num;
            }
        }
        
        System.out.println("Ten unique random numbers are: " + Arrays.toString(randomNumbers));
    }
}
