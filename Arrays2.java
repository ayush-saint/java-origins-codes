import java.util.Scanner;
import java.util.Arrays;
public class Arrays2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 5 number ");
        int[] arr = new int[5];

        for(int i = 0 ;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
 //       for(int num : arr){
 //       System.out.println(num + " ");
 //       }
        System.out.println(Arrays.toString(arr));
    }
}

