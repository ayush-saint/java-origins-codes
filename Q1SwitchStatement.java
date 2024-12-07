// program to make a simple calculator with the help of switch statement

import java.util.*;
public class Q1SwitchStatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the operation *,/,+,- : ");
        char operator = scanner.next().charAt(0);
        System.out.println("enter the numbers : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result;
        switch(operator){
            case '*' : result = a*b;
            System.out.println(result);
            break;
            case '/' :
            if(b!=0){
                result = a/b;
                System.out.println(result);
            }else{
                System.out.println("the given number is not divisible ");
            }
            break;
            case '+' : result = a+b;
            System.out.println( result );
            break;
            case '-' : result = a-b;
            System.out.println(result);
            break;
            default :
            System.out.println("invalid input ");
            break;
        };
        scanner.close();
    }
}