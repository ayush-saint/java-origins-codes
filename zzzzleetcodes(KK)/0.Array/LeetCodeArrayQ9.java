
/*      Create Target Array in the Given Order
Easy
Topics
Companies
Hint
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]   
*/
import java.util.*;

public class LeetCodeArrayQ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 5;

        int[] nums = new int[5];
        System.out.println("enter the elements of nums : ");
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] index = new int[5];
        System.out.println("enter the elements of index : ");
        for (int i = 0; i < 5; i++) {
            index[i] = scanner.nextInt();
        }

        scanner.close();

        int[] target = targetelementclass(nums, index);
        System.out.println("the answer is : ");
        for (int x : target) {
            System.out.print(x + " ");
        }
    }

    public static int[] targetelementclass(int[] nums, int[] index) {
        List<Integer> targetlist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetlist.add(index[i], nums[i]);
        }
        ;
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = targetlist.get(i);
        }
        return target;
    }

}