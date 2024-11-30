//multidimensional array in java
import java.util.Scanner;
import java.util.Arrays;
public class multidimensionalarray{
    public static void main(String[] args){
        int[][] arr = new int[3][];
        arr[0]=new int[]{2,3,44};
        arr[1]=new int[]{3,44,22,33};
        arr[2]=new int[]{333,44,22,22,3333,444444,45};
    System.out.println(Arrays.deepToString(arr));
    }
}
