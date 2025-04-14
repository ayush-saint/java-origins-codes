/*      Flipping an Image
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:
*/

import java.util.Scanner;
import java.util.Arrays;

public class LeetCodeArrayQ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number for the row and column of binary matrix : ");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        System.out.println("enter the elements (0 and 1) for matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("your entered array is :" + Arrays.deepToString(array));
        scanner.close();

        int[][] flips = flip(array);
        System.out.println("the answer binary array is :" + Arrays.deepToString(flips));
    }

    public static int[][] flip(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int temp = array[i][left] ^ 1;
                array[i][left] = array[i][right] ^ 1;
                array[i][right] = temp;
                left++;
                right--;
            }

        }
        return array;
    }
}
