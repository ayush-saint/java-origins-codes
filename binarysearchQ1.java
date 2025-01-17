// Question : ceiling of a array
// Given a sorted array and a target number, print the index of smallest element in the array that is greater than or equal to the target. If no such element exists, return -1

public class binarysearchQ1{
    public static void main(String[] args){
        int[] array = {1,22,33,55,66,77,88};
        int target = 56;
        int ans = binarysearch(array,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] array, int target){
        int start = 0 ;
        int end = array.length - 1; 

        if(target>array[end]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==array[mid]){
                return mid;
            }
            if(target>array[mid]){
                start=mid+1;
            }
            else{
                end = mid-1;                               
            }
        }
        return start;
    }
}