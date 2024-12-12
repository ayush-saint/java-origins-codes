// write a function that takes its input and return the circumference of the circle 

import java.util.Scanner;
public class JavaQ4{
    public static float circumference(int n ){
        float pi = 3.14f ;
        float circum = 2 * pi * n;
        return circum; 
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of the circle :");
        int n = scanner.nextInt();
        float c = circumference(n);
        System.out.println(c);
    }
}