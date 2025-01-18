// Question - floor of the element in an sorted array 
// Given a sorted array and a target number, print the index of largest element in the array that is smaller than or equal to the target. If no such element exists, return -1

public class binarysearchQ2{
    public static void main(String[] args){
        int[] array = {1,21,23,45,66,87,92,101};
        int target = 55;
        int ans = binarysearch(array,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] array, int target){
        int start = 0;
        int end = array.length -1;
      
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==array[mid]){
                return mid;
            }
            else if(target>array[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end;

    }
}