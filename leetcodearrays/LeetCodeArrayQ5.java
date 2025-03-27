/*  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

import java.util.Scanner;

public class LeetCodeArrayQ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter value of n  : ");
        int n = scanner.nextInt();
        int[] nums = new int[2 * n];

        System.out.println("enter the elements of nums: ");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("the array nums is : ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        scanner.close();

        int[] answer = shuffle(nums, n);
        for (int ans : answer) {
            System.out.print(ans + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            index++;
            result[index] = nums[i + n];
            index++;
        }
        return result;

    }
}