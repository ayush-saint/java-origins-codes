// Question _rotated binary search in array with duplicate values 
// given a rotated sorted array that may contain duplicate values write an algorithms to searcch for target element. if the element exists return its index and otherwise return -1

public class binarysearchQ9{
    public static void main(String[] args){
        int[] array ={2, 2, 2, 2, 4, 2, 2, 2};
        int target =4;
        int ans = binarysearch(array,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] array,int target){
        int start = 0; 
        int end = array.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            if(array[start]==array[mid]&&array[mid]==array[end]){
                start++;
                end++;
                continue;
            }
            if(array[start]<array[mid]){
            if(array[start]<=target&&target<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            }
            else{
            if(array[mid]<target&&array[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            }
        }
        return -1;
}
}