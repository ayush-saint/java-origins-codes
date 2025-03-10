import java.util.Scanner;
import java.util.Arrays;
public class Arrays3{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String[] str = new String[5];

            System.out.println("enter some String : ");

            for(int i =0 ;i<str.length ;i++){
            str[i]=scanner.nextLine();
            }
    System.out.println(Arrays.toString(str));
    }
} 

