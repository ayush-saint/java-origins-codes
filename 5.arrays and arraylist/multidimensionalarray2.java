//program to print 2d array with for loop 
import java.util.Arrays;
public class multidimensionalarray2{
    public static void main(String[] args){
        int[][] arr = {
            {2,3,44,55,4},
            {33,22,55,3},
            {33,22,55,3}
        };
        for(int i=0; i<arr.length ;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}