//program using if else conditional statement 
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

}