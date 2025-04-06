//example of arraylist with input and output 

import java.util.*;
public class Arraylistintro2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("enter the number of elements in arraylist");
        int n = scanner.nextInt();
        for(int i = 0 ; i<n ; i++){
        number.add(scanner.nextInt());       
    };
        System.out.println(number);
    }
}