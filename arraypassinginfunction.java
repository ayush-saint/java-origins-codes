//program to pass array in function ,changing value of array by calling function 

import java.util.Scanner;
import java.util.Arrays;

public class arraypassinginfunction{
    public static void main(String[] args){
        int[] number = {1,2,3,5,55};
        System.out.println(Arrays.toString(number));
        change(number);
        System.out.println(Arrays.toString(number));
    }
    static void change(int[] num){
        num[2]=99;
    }
}