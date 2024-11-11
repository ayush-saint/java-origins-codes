import java.util.Scanner;
public class function{
    public static void main(String[] args){
        int ans = sum();
        System.out.println(ans);
    
    }
        static int sum(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the first number ");
            int a = scanner.nextInt();
            System.out.println("enter the second number ");
            int b = scanner.nextInt();
            int sum = a+b;
            return sum;
        }
    } 
    