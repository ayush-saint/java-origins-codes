//question-cheak number is positive or zero/negative
import java.util.Scanner;
public class IfElseCondition{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("enter the number: "); 
        int n = number.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }else{
            System.out.println("the number is either negative or zero");
        }
        number.close();
    }
}