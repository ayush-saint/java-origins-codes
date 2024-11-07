//program_to write table of the given number.
import java.util.Scanner;
public class DoWhileLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = scanner.nextInt();
        int i = 1;
        do{
            System.out.println(number*i);
            i++;
        }while(i<=10);
        scanner.close();
    }
}