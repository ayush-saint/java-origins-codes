
/*  You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
*/
import java.util.Scanner;

public class LeetCodeArrayQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of people p,and the number of bank accounts' holding q: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[][] accounts = new int[p][q];

        System.out.println("enter the bank balance of each person : ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                accounts[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(accounts[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("the most amount of wealth is :" + maxwealth(accounts, p, q));
    }

    public static int maxwealth(int[][] accounts, int p, int q) {
        int maxwealth = 0;
        for (int i = 0; i < p; i++) {
            int wealth = 0;
            for (int j = 0; j < q; j++) {
                wealth = wealth + accounts[i][j];
            }
            if (wealth > maxwealth) {
                maxwealth = wealth;
            }
        }

        return maxwealth;
    }
}
