// print the factorial of the number given by the user 

import java.util.Scanner;

public class recursionQ4{
    
    public static int factorial(int n ){
        if(n==1 || n==0){
            return 1;
        }
        int factorialfirst = factorial(n-1); 
        int finalfactor = n*factorialfirst;
        return finalfactor;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = scanner.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
}