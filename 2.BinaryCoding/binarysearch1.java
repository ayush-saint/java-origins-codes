// search an element in the sorted array and print the indices of the array 

public class binarysearch1{
    public static void main(String[] args){
        int[] array = {-11,0,1,2,4,55,66,77};
        int target = 66;
        int ans = binarysearch(array,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] array, int target){
        int start = 0 ; 
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<array[mid]){
                end=mid-1;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
} 