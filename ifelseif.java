//program to print namaste , hello and bonjour on typing   1,2,3
import java.util.*;

public class ifelseif{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();
        if(button==1){
            System.out.println("namaste");
        }else if(button==2){
            System.out.println("hello");
        }else if(button==3){
            System.out.println("bonjour");
        }else{
            System.out.println("invalid input ");
        }
        scanner.close();
    }
}