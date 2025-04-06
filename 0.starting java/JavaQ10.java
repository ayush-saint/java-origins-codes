//write a program to print fibonacci series of the n terms where n is input by user 
 
import java.util.Scanner;
public class JavaQ10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n number");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        if(n<=0){
            System.out.println("enter the positive number ");
        }
        else{
            if(n>1){
                System.out.print(a+" ");
                for(int i = 1; i<n ; i++){
                    System.out.print(b+" ");
                    int temp = b; 
                    b=a+b;
                    a=temp;
                }
            }
        }
    }
}