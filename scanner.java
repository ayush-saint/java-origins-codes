//program to add two number to understand scanners
import java.util.*;
class scanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first a : ");
        int a = sc.nextInt();
        System.out.println("enter the number b : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}