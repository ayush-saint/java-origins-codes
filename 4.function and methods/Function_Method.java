// In java function is called as Method 


import java.util.Scanner;

public class Function_Method{
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scanner.nextLine();
        PrintMyName(name);
    }

}