//program_input the number of the students and get the grades
import java.util.Scanner;
public class IfElseIfCondition{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("enter the number to get the grades :  ");
        int grades = number.nextInt();
        if(grades>=90){
            System.out.println("the student gets A grades");
        }else if(grades>=80){
            System.out.println("the student gets B grades");
        }else if(grades>=70){
            System.out.println("the student gets C grades");
        }else if(grades>=60){
            System.out.println("the student gets D grades");
        }else if(grades>=40){
            System.out.println("the student gets E grades");
        }else{
            System.out.println("the student fails");
        }
        number.close();
    }
}