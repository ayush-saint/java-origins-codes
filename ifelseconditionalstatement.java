//program using if else conditional statement 

/*__code to decide whether the person is adult or minor

import java.util.*;
class ifelseconditionalstatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age : ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult ");
        };
        sc.close();

    }

}*/

/*__code to print that the given no is odd or even 

import java.util.*;
class ifelseconditionalstatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number to cheak whether it's odd or even : ");
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("even ");
        }else{
            System.out.println("odd");
        };
        scanner.close();
    }
}*/

/*__input two number a and b , print equal if a=b,print greater if a>b, print lesser if a<b  
import java.util.*;
class ifelseconditionalstatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number a : ");
        int a = scanner.nextInt();
        System.out.print("enter the number b : ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("greater");
        }
        if(a<b){
            System.out.println("lesser");
        }else{
            System.out.println("equal");
        };
        scanner.close();

    }
}*/

//__input two number a and b , print equal if a=b,print greater if a>b, print lesser if a<b in diff way
import java.util.*;
public class ifelseconditionalstatement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number a : ");
        int a = scanner.nextInt();
        System.out.print("enter the number b : ");
        int b = scanner.nextInt();
        if(a==b){
            System.out.println("equals");
        }
        else{
            if(a>b){
                System.out.println("greater");

            }else{
                System.out.println("lesser");
            };
        };
        scanner.close();

    }
}