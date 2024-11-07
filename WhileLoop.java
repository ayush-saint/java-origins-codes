//program_cheak the number of character in the given string.
import java.util.Scanner;
public class WhileLoop{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the string : ");
    String input = scanner.next();
    int index = 0;
    while(index<input.length()){
        index++;
    }
    System.out.println(index);
    scanner.close();
}
}