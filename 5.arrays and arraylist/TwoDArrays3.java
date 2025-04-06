//input of arrays and output of array with enhanced for loop 

import java.util.*;
import java.util.Arrays;
public class TwoDArrays3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of the arrays");

        int[][] arr = new int[3][3];

        for(int i = 0 ;i<arr.length; i++){
            for(int j =0 ; j<arr[i].length ;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        //output by enhanced for loop
        for(int[] ar : arr){
            System.out.println(Arrays.toString(ar));
        }
        

    }
}