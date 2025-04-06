//Write a program to enter the number till user want and at the end it should display the count of positive, negative and zeroes entered 

import java.util.Scanner;
public class JavaQ7{
    public static void main(String[] args){
        int positives = 0 ;
        int negatives =0 ; 
        int zeros = 0 ; 
        System.out.println("enter 1 to continue and 0 to stop ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while(input == 1){
            System.out.println("enter your numbers ");
            int number = scanner.nextInt();
            if(number>0){
                positives++;
            }else if (number<0){
                negatives++;
            }else{
                zeros++;
            }
            System.out.println("enter 1 to continue and 0 to stop");
            input = scanner.nextInt();
        }
        System.out.println("no of positives:"+positives);
        System.out.println("no of negatives :"+negatives);
        System.out.println("no of zeros:"+zeros);

    }
}
 