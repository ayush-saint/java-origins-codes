//given an array of integers, return how many elements has the even number of digits 

public class linearsearchQ6{
    public static void main(String[] args){
        int [] arr = {1,22,333,44,44,5555,5243,222222};
        int ans = linearsearch(arr);
        System.out.println(ans);
    }
    public static int linearsearch(int[] arr){
        int count = 0;
        for(int array : arr){
            int number = digits(array);
            if(number%2==0){
            count++;
            }
        }
        return count;
    }
    public static int digits(int array){
        int digit = 0 ;
        while(array>0){
            digit++;
            array=array/10;
        }
        return digit;
    }
}