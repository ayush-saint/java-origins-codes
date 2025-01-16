//search an element in 2D array by linear search algorithm 

import java.util.Arrays;

public class linearsearchQ5{
    public static void main(String[] args){
        int[][] array ={
            {1,2,3,4},
            {22,33,44,55,},
            {111,222,333,444,5555},
        };
        int target = 5555;

        int[] ans = linearsearch( array, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] linearsearch(int[][] arrays, int targets){
        if(arrays.length==0){
            return new int[]{-1,-1};
        }
        for(int i = 0 ; i<arrays.length ; i++){
            for(int j = 0 ; j<arrays[i].length ; j++){
                if(arrays[i][j]==targets){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}