//Write a program that takes a string input from the user and checks if a specified letter is present in the string. Use a linear search algorithm to perform the search and return a boolean value indicating whether the letter is found or not.


import java.util.Arrays;
import java.util.Scanner;

public class linearsearchQ2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the String");
        String name = scanner.nextLine();
        System.out.println("enter the letter to search for ");
        char letter = scanner.next().charAt(0);

        boolean ans = linearsearch(name,letter);
        System.out.println(ans);

        scanner.close();
    }
    public static boolean linearsearch(String name , char letter){
        if(name.length()==0){
            return false;
        }
        for(int i = 0 ; i<name.length() ; i++){
            if(letter==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}