//Write a function that calculate the greatest common divisor of 2 numbers

import java.util.Scanner;
public class JavaQ9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the two number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while(a!=b){
            if(a>b){
                a=a-b;  
            }else{
                b=b-a;
            }
        }
        System.out.println(b);
    }
}