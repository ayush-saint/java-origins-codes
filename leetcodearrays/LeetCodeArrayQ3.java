/*  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

import java.util.Scanner;
public class LeetCodeArrayQ3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the number of elements of nums array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("enter the elements : ");
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }

        System.out.println("the elements of nums array is : ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        scanner.close();

        int[] answer = runningsum(nums);
        System.out.println("runningsum of array is :");
        for(int ans: answer){
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static int[] runningsum(int[] nums){
        int n = nums.length;
        int[] runningsum = new int[n];
        runningsum[0]=nums[0];
        for(int i = 1 ; i<n ; i++){
            runningsum[i]=runningsum[i-1]+nums[i];
        }
        return runningsum;
    }
 }