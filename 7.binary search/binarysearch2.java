//print the index of the target element by the order agnostic binary search (first cheak the sorted array is ascending or descending )

public class binarysearch2{
    public static void main(String[] args){
        int[] array ={9,8,7,4,3,2,-11};
        int target = 7;
        int ans = binarysearch(array,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] array, int target){
        int start = 0 ; 
        int end = array.length-1;

        boolean isascen = array[start]<=array[end];

        while(start<=end){
            int mid = start + (end - start)/2;

            if(array[mid]==target){
                return mid;
            }

            if(isascen){
                if(target<array[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>array[mid]){
                    end=mid-1;                    
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}