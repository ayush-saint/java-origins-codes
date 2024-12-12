//Write a function which takes in 2 numbers and return the greater of those two 

import java.util.Scanner;
public class JavaQ3{
    public static void greater(int a ,int b){
        if(a>b){
            System.out.println("the greater no is :"+a);
        }else{
            System.out.println("the greater no is :"+b);
        }
        return;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the two number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        greater(a,b);
    }
}