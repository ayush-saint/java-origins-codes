import java.util.*;
public class Q3ForLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number for table ");
        int n = scanner.nextInt();
        for(int i = 1 ; i<11 ; i++){
        System.out.println(n*i);
        };
        scanner.close();
    }
}