//using switch statement program to print namaste , hello and bonjour on typing   1,2,3

import java.util.Scanner;
public class switchstatementexample{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();
        switch(button){
            case 1 : System.out.println("namaste");
            break;
            case 2 : System.out.println("hello ");
            break;
            case 3 : System.out.println("bonjour");
            break;
            default : System.out.println("invalid input ");
            break;
        };
        scanner.close();
    }
}
