//program to input string and print those string with array in java
import java.util.Scanner;
import java.util.Arrays;
public class Stringarray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("enter some strings : ");
        for (int i =0 ; i<str.length ; i++){
            str[i]=scanner.nextLine();
        }
        System.out.println(Arrays.toString(str));   
    }
}