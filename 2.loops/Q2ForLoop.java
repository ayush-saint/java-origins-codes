//program to add sum of first n natural numbers 
import java.util.*;
public class Q2ForLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number n : ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1 ; i <= n ; i++ ){
            sum=sum +i;
        };

        System.out.println(sum);
        scanner.close();
    }

}