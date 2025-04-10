/*      Find the Highest Altitude
Easy
Topics
Companies
Hint
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

 

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:
Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
*/

import java.util.*;

public class LeetCodeArrayQ12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of point where biker stops for altitude : ");
        int n = scanner.nextInt();

        int[] altitudes = new int[n];
        System.out.println("enter the altitudes : ");
        for (int i = 0; i < n; i++) {
            altitudes[i] = scanner.nextInt();
        }

        System.out.println("the altitudes are :");
        for (int i = 0; i < n; i++) {
            System.out.print(altitudes[i] + " ");
        }
        System.out.println();

        scanner.close();

        int answer = highestaltitude(altitudes);
        System.out.println("the highest altitudes is " + answer);

    }

    public static int highestaltitude(int[] altitudes) {
        int maxaltitude = 0;

        for (int i : altitudes) {
            maxaltitude = Math.max(maxaltitude, i);
        }

        return maxaltitude;
    }
}