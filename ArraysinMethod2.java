//changing value of array by function call 

import java.util.Arrays;
public class ArraysinMethod2{
    public static void main(String[] args){
        int[] number = {33,22 ,344 ,22,33};
        System.out.println(Arrays.toString(number));
        change(number);
        System.out.println(Arrays.toString(number));
    }
    public static void change(int[] arr){
        arr[0] = 3;
    }
}