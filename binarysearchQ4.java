// question __find the first and last position of element in the sorted array 
// given an array of integers array sorted in ascending order find the starting and the ending position of the given target value, if target not found in the array ,retrun [-1,-1]

import java.util.*;
import java.util.Arrays;
public class binarysearchQ4{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,5,6,7};
        int target = 5;
        int[] ans = binarysearch(array,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] binarysearch(int[] array, int target ){
            int[] result = new int[2];
            result[0]=findfirst(array,target);
            result[1]=findlast(array,target);
            return result ;
    }
    public static int findfirst(int[] array, int target){
        int start = 0 ;
        int end = array.length - 1;
        int index = -1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target==array[mid]){
                index=mid;
                end=mid-1;
            }
            else if(target<array[mid]){
                end =mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
    public static int findlast(int[] array,int target){
        int start = 0;
        int end = array.length - 1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==array[mid]){
                index=mid;
                start=mid+1;
            }
            else if(target<array[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return index;
    }
}