//stroe number of marks getting in exams in physics and chem and maths using arrays 

import java.util.Scanner;
public class Arrays_intro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("enter the marks obtained in subjects");
        int[] marks = new int[3];

        System.out.println("enter the marks of maths");
        marks[0]=scanner.nextInt();

        System.out.println("enter the marks of chem");
        marks[1]=scanner.nextInt();
        
        System.out.println("enter the marks of physics");
        marks[2]=scanner.nextInt();
        
        System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);
    }
}