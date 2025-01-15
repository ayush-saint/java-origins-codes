//code to find an element in  the given array (linear search algorithm )

public class linearsearch1{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,4,22,55,33,22};
        int target = 55;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
        
    }

    public static int linearsearch(int[] arrr, int target){
        if(arrr.length==0){
            return -1;
        }
        for(int index = 0; index<arrr.length ;index++){
            int inde = arrr[index];
            if(target==inde){
                return index;
            }
        }
        return -1;
    }
}