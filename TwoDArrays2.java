//input and output of 2D arrays

import java.util.*;
import java.util.Arrays;
public class TwoDArrays2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.print("enter the numbers of arrays ");
        
        for(int i = 0 ; i<arr.length;i++){
            for(int j =0 ; j<arr[i].length;j++){
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for(int i = 0 ; i<arr.length ;i++){
            for(int j =0 ; j<arr[i].length ; j++){
                System.out.println(Arrays.toString(arr[i]));
                //you can also use for [System.out.println(arr[i][j]+" ")] to print the elements of this array 
            }
            System.out.println();
        }

    }
}