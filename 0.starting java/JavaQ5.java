// Write a function that takes in age as input and return if that the person is eligible for vote(18+) or not(minor) 

import java.util.Scanner;

public class JavaQ5{
    public static void vote(int age){
        if(age>18){
            System.out.println("the person is eligible for vote ");
        }else{
            System.out.println("the person is not eligible for vote ");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = scanner.nextInt();
        vote(age);
    }
}