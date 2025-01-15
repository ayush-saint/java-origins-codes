//search for an integer in the array from one 1 to 4 

import java.util.Scanner;
import java.util.Arrays;

public class linearsearchQ3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int size = scanner.nextInt();

        System.out.println("enter the number of array ");
        int[] array = new int[size];
        for(int i = 0 ; i<array.length ; i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("your entered array is :");
        for(int nums : array){
            System.out.print(nums+" ");
        }
        System.out.println();

        System.out.println("enter the element you want to search ");
        int target = scanner.nextInt();

        int Start = 1 ;
        int end = 4 ;

        int ans = linearsearch(array,target,Start ,end );
        System.out.println(ans);

        scanner.close();
    }

    public static int linearsearch(int[] array, int target, int Start, int end){
        if( Start <0 || end>=array.length ||Start>end ){
            return -1;
        }
        for(int i=Start; i<=end ;i++){
            int num = array[i];
            if(target==num){
                return i;
            }
        }
        return -1;

    }


}