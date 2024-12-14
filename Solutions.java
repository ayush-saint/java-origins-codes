//write a program to print fibonacci series of the n terms where n is input by user 

import java.util.*;


public class Solutions {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }


           System.out.println();
       }
   }   
}


