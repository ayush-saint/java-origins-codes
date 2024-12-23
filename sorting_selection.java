// sort the array by selection sorting 

import java.util.*;

public class sorting_selection{
    public static void printarray(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};

        //selection sort 
        for (int i = 0 ; i<arr.length ; i++){
            int smallest = i ; 
            for (int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[i]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printarray(arr);
    }
}