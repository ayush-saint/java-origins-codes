//take a matrix as input from the user search for a given number x and print the indices at which it occurs 

import java.util.Scanner;
public class TwoDArraysQ1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of rows ");
        int row = scanner.nextInt();
        System.out.println("enter the number of column ");
        int column = scanner.nextInt();

        System.out.println("enter the array ");
        int[][] numbers = new int[row][column];

        for(int i = 0 ; i<row ;i++){
            for(int j =0 ; j<column ; j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        System.out.println("enter the number you want to find ");
        int x = scanner.nextInt();

        for(int i = 0 ; i<row ;i++){
            for(int j =0 ; j<column ; j++){
                if(numbers[i][j]==x){
                    System.out.println("the indices of the number is "+i+" "+j);
                }            
            }
        }



    }
}