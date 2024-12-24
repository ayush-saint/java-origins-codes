//print sum of the first n natural number n is the input by recursion

import java.util.Scanner;
public class recursionQ3{

    public static void sum(int i,int sum , int n){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1,sum,n);

    }
    public static void main(String[] args){
        int i = 1;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = scanner.nextInt();
        sum(i,sum,n);

    }
}