/*    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class LeetCodeArrayQ6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of students : ");
        int n = scanner.nextInt();

        System.out.println("enter the number of candies the students have in order : ");
        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i]=scanner.nextInt();
        }

        System.out.println("enter the number of extra candies that you have : ");
        int extraCandies = scanner.nextInt();

        System.out.println("the number of candies the students have is : ");
        for(int can : candies){
            System.out.print(can +" ");
        }
        System.out.println();
        scanner.close();

        System.out.println(kidswithcandies(candies,extraCandies));
        
    }

        public static List<Boolean> kidswithcandies(int[] candies,int extraCandies){
            int max = 0;
            for(int c:candies){
                if(c>max)
                max=c;
            }
            
            List<Boolean> result = new ArrayList<>();
            for(int i = 0 ; i<candies.length;i++){
                result.add((candies[i]+extraCandies)>=max);
            }
            return result ;
        }
}
