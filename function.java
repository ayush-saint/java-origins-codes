//program for sum of two number where numbers are passed in function call

import java.util.Scanner;
public class function{
    public static void main(String[] args){
        int ans = sum(40,44);
        System.out.println(ans);
    
    }
      static int sum(int a,int b){
            int sum = a+b;
            return sum;
      }
    } 
    