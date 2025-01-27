//Question __ peak index of the mountain array 
//you are given an integer mountain array arr of length n where the value in the array increases to the peak array and then decreases, return the index of the peak element

public class binarysearchQ6{
    public static void main(String[] args){
        int[] arr = {0,10,11,5,2};
        int ans = binarysearch(arr);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;            
    }
}
