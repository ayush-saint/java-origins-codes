//program to print the entered 2d array with scanner 
import java.util.Scanner;
import java.util.Arrays;
public class multidarray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the no of row ");
        int row = scanner.nextInt();

        System.out.println("enter the no of column ");
        int column = scanner.nextInt();

        int[][] arrr = new int[row][column];
        
        System.out.println("enter the numbers of array ");

        for(int i = 0 ; i<row ; i++){
            for(int j =0 ;j<column ; j++){
                arrr[i][j]= scanner.nextInt();
            }
        }

        System.out.println("numbers of 2d array are ");
        
     /* for(int i=0; i<row; i++){
            for(int j=0; j<column ; j++){
                System.out.println(arrr[i][j] 3+" ");
            }
            System.out.println();
        }*/
        for (int i =0 ; i<arrr.length ; i++){
            System.out.println(Arrays.toString(arrr[i]));
        }
    }
}