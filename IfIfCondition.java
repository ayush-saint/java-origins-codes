//program_cheak the given year is leap year or not 
import java.util.Scanner;
public class IfIfCondition{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write the year to know ,it's leap year or not : ");
        int year =scanner.nextInt();
        if(year % 4 == 0){
            System.out.println(year + "the year is leap year");
        }
        if(year % 100 == 0 && year % 400 != 0){
            System.out.println(year+"the year is not leap year");
        }
        if(year % 400 == 0){
            System.out.println(year+"the year is leap year");
        }
        scanner.close();
    }
}