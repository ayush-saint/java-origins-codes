//Make a program to multiply two number using Method 

import java.util.Scanner;


public class MethodQ2{

    public static int multiply(int a ,int b){
        int m = a * b;
        return m ;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two number for multiplication");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = multiply(a,b);
        System.out.println(m);
    }
}