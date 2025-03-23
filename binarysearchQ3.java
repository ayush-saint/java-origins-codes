// find the smallest letter greater than the target 

public class binarysearchQ3{
    public static void main(String[] args){
        char[] array = {'c','f','j'};
        char target = 'a';
        char ans = Search(array,target);
        System.out.println(ans);
    }
    public static char Search(char[] array, char target){
        int start = 0 ;
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return array[start % array.length];
    }
}
