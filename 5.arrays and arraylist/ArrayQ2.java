//Maximum value of the array 

import java.util.Arrays;
public class ArrayQ2{
    public static void main(String[] args){
        int[] arr = {1,22,44,55,23,33};
        System.out.println(max(arr));

    }

    public static int max(int[] arr){
        int maxval=arr[0];

        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i]>maxval){
                maxval=arr[i];
            }    
        }
        return maxval;        

    }
}