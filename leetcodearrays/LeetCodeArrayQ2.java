/*  Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */

 import java.util.Scanner;
 public class LeetCodeArrayQ2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of element of nums: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("enter the elements : ");
        for(int i = 0 ; i<3; i++){
            nums[i]=scanner.nextInt();
        }

        System.out.println("enter the elements : ");
        for(int i = 0 ; i<3; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        scanner.close();

        int[] answer = concatenation(nums);
        for(int answeranswer : answer){
            System.out.print(answeranswer);
        }
        
    }

    public static int[] concatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0 ; i<n; i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
 }