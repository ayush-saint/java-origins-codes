//program to input array using for each loop 
import java.util.Scanner;
import java.util.Arrays;
public class inputarrays2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
    
        System.out.println("enter 5 number ");
        
        for(int i = 0 ; i <number.length ; i++){
            number[i]=scanner.nextInt();
        }
        
        for(int num : number){
            System.out.println(num);
        }
    }
}