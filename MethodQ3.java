// Make a program to print factorial of the inputed number 

import java.util.Scanner;
public class MethodQ3{

    public static void factorial(int a ){
        int f = 1;
        for(int i =1 ; i<=a ; i++ ){
            f = f*i;
        }
        System.out.println(f);
        return;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your number for factorial :");
        int a = scanner.nextInt();
        factorial(a);
               
    }
}