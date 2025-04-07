
/*     How Many Numbers Are Smaller Than the Current Number
Easy
Topics
Companies
Hint
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

 

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
import java.util.Scanner;

public class LeetCodeArrayQ8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of element in the array nums : ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("enter the elements of nums : ");
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("your array is :");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        scanner.close();

        System.out.println("the answer array is : ");
        int[] leastno = leastnumber(nums);
        for (int l : leastno) {
            System.out.print(l + " ");
        }
    }

    public static int[] leastnumber(int[] nums) {
        int[] least = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] > nums[i]) {
                    count++;
                }
            }
            least[j] = count;
        }
        return least;
    }
}
