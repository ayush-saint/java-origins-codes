import java.util.Scanner;
public class function{
    public static void main(String[] args){
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();

    }
        static void sum(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the first number ");
            int a = scanner.nextInt();
            System.out.println("enter the second number ");
            int b = scanner.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }
    } 
    