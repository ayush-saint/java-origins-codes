//two number are entered by the user , x and n .Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;

public class NumberCounter {
    public static long power(int x,int n){
         return(long) Math.pow(x, n);
    
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number x ");
        int x = scanner.nextInt();
        System.out.println("enter the number n");
        int n = scanner.nextInt();

        long result = power(x,n);
        System.out.println(result);
        scanner.close();
        
    }

    }

