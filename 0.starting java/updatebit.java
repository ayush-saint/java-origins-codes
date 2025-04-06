//update a specific bit at position i in a number n using bit manipulation in Java;

import java.util.Scanner;
public class updatebit{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = scanner.nextInt();

        System.out.println("enter the position");
        int pos = scanner.nextInt();

        System.out.println("enter the operation(set or clear)");
        String oper = scanner.next();

        if(oper.equals("set")){
            int bitmask = 1<<pos;
            int newnumber = bitmask | n;
            System.out.println(newnumber);
        }else if(oper.equals("clear")){
            int bitmask = 1<<pos;
            int notbitmask = ~(bitmask);
            int newnumber = notbitmask & n;
            System.out.println(newnumber);
        }else{
            System.out.println("invalid input ");
        }

    }
}