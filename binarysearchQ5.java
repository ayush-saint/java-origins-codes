//Question __find the position of an element in a sorted array of infinite numbers 
// Given a sorted array of infinite numbers, find the position of a given target number in the array 

import java.util.*;
import java.util.Arrays;
public class binarysearchQ5{
    public static void main(String[] args){
        int[] array = {1,2,3,5,22,33,44,55,66,77,88,99,100,111,222,333,444,555,666,777,888,999};
        int target = 77;
        System.out.println(ans(array,target));
    }
    public static int ans(int[] array,int target){
        int start = 0 ;
        int end = 1;
        while(target>array[end]){
            int newstart = end + 1;
            end = start +(end-start+1)*2;
            start=newstart;
        }
        return binarysearch(array,target,start,end);
    }
    public static int binarysearch(int[] array,int target,int start ,int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
    