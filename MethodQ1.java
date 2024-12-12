// Add two number with Method 

import java.util.Scanner;

public class MethodQ1{
    public static int sum( int a , int b ){
        int s = a + b ;
        return s ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sum(a,b);
        System.out.println(s);
    }
}