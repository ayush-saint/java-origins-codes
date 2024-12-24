//print the fibonacci sequence of the number input by the user using recursion 

import java.util.Scanner;
public class recursionQ6{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = scanner.nextInt();
        int a = 0 ;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        factorial(a,b,n-2)      ;

    } 
    
    public static void factorial(int a , int b , int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        factorial(b,c,n-1);
    }
  
}