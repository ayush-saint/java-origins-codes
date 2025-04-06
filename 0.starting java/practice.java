import java.util.Arrays;
public class practice{
    public static void main(String[] args){
        int[] arr = {1,2,5,5,66,77};
        array(arr);
    }
    public static void array(int[] arr){
        arr[2]=33;
        System.out.println("enter the web" + Arrays.toString(arr) );
    }
}