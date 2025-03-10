// Question_find the rotation count in rotated sorted array 
// given an rotated sorted array,find the number of times the array is rotated.

public class binarysearchQ10 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 15, 19, 2, 3};
        System.out.println(findRotationCount(arr));
    }
    public static int findRotationCount(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return 0;
        }  
}
