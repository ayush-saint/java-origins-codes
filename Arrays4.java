//write a program in java to store 5 rollno of class using syntax of Array type 1 
import java.util.Scanner;
import java.util.Arrays;
public class Arrays4{
    public static void main(String[] args){
        int[] rollno = new int[5];
        rollno[0]=1;
        rollno[1]=2;
        rollno[2]=3;
        rollno[3]=4;
        rollno[4]=5;
        for(int i=0;i<rollno.length;i++){
            System.out.println(rollno[i]);
        }
    }
}