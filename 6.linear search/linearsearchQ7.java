//given an array of integers, return how many elements has the even number of digits using diff Method return 

public class linearsearchQ7{
    public static void main(String[] args){
        int[] array = {22,333,55,1122,55555};
        int ans = linearsearch(array);
        System.out.println(ans);
    }
    public static int linearsearch(int[] array){
        int count =  0;
        for(int arr : array){
            int number = digit(arr);
            if(number%2==0){
                count++;
            }
        }
        return count;
    }
    public static int digit(int number){
        return (int)(Math.log10(number))+1;
    }
}
