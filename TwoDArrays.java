// Example of the 2 D Arrays 

public class TwoDArrays{
    public static void main(String[] args){
        int [][] number = {
            {1,2,3},
            {3,44,5},
            {33,44,55}
        };
        for(int i = 0;i<number.length;i++){
            for(int j = 0 ; j<number[i].length;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}