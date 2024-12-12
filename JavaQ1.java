// enter three number from the user and make a function to print their average

import java.util.Scanner;
public class JavaQ1{

    public static float average(int a , int b , int c){
        int av = a+b+c;
        float aver = av/3;
        return aver;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the three number for the average :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float z = average(a,b,c);
        System.out.println(z);
    }
}