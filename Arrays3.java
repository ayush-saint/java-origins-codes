import java.util.Scanner;
import java.util.Arrays;
public class Arrays3{
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter some String : ");
        String[] str = new String[5];
        for(int i =0 ;i<str.length ;i++){
            str[i]=scanner.next();
        }
    System.out.println(Arrays.toString(str));
    }
} 
