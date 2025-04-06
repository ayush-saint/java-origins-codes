//take string as a input and print it 

import java.util.Scanner;
public class String_intro2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sentence/word");

        //next(); (for word ) and nextLine(); (for sentence and word both)        
        String input = scanner.nextLine(); 
        System.out.println(input);


    }
}