/*           Number of Good Pairs
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:
*/
import java.util.*;
public class LeetCodeArrayQ7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of elements in the nums : ");
        int n = scanner.nextInt();

        System.out.println("enter the elements of the nums : ");
        int[]  nums = new int[n];
        for(int i = 0; i<n ; i++ ){
            nums[i]=scanner.nextInt();            
        }

        System.out.println("the input array nums is ");
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();

        scanner.close();

        System.out.println(pair(nums));
    }
    public static int pair(int[] nums){
        int count = 0;
        for(int i =0;i<nums.length;i++){
            for(int j = 1+i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count ;
    }
}

