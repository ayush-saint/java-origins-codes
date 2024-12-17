//take an array as input from the user . Search for the given number x and print the index at which it occurs 
import java.util.Scanner;
public class ArraysQ1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

        System.out.println("enter "+size+" numbers ");

        for(int i =0;i<size;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println("enter the number you want to find");
        int x = scanner.nextInt();

        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("the index numbe is "+i);
            }
        }
        System.out.println("the entered number is not in array");
        
    }
}