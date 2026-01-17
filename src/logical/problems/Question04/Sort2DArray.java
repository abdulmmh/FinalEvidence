package logical.problems.Question04;

import java.util.Arrays;


public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 3, 2}, {6, 4, 5}, {7, 9, 8}};
        for (int i = 0; i < arr2D.length; i++) {
            sort2dArrayElement(arr2D[i]);
        }
        System.out.println("Sorted Multidimensional Array in ascending order: " + Arrays.deepToString(arr2D));
    }
    
    
    static void sort2dArrayElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
