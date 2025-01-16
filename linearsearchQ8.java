// you are given a 2d array where each array is considered as the total wealth of the person and print the highest wealth (adding all elements of the array )
//Max wealth problem 

public class linearsearchQ8{
    public static void main(String[] args){
        int[][] array = {
            {1,2,3},
            {1,5,2,5},
            {11,1},
            {6,2,3},
        };
        int ans = linearsearch(array);
        System.out.println(ans);
    }
    public static int linearsearch(int[][] array){
        int maxwealth = 0 ;
        for(int[] arr: array){
            int currentwealth = 0 ;
            for(int ar : arr){
                currentwealth += ar;
            }
            if (currentwealth>maxwealth){
                maxwealth=currentwealth;
            }
        }
        return maxwealth;
    }
}
