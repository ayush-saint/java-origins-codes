//program to swap two numbers 
import java.util.Scanner;
public class swappingnumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the a number ");
        int a = scanner.nextInt();
        System.out.println("enter the b number ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"  "+b);
    }
}