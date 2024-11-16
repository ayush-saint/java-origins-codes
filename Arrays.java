import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("entter the 5 numbers : ");
        int[] arr = new int[5];

        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.println(arr[i]+" ");
        }
    }
}