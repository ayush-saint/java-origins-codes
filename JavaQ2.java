// Write a function to print the sum of all odd number from 1 to n 

import java.util.Scanner;

public class JavaQ2{
        public static int oddsum (int n){
        int sum = 0;
        for(int i =1 ; i<=n ; i=i+2){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to get the sum ");
        int n = scanner.nextInt();
        if(n<1){
            System.out.println("invalid input ");
        }else{
        int z = oddsum(n);
        System.out.println(z);
    }
    }
}