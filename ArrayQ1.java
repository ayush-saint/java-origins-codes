    //swap the number in the Array

    import java.util.Arrays;
    public class ArrayQ1{
        public static void main(String[] args){
            int[] arr  = {1,2,33,44,22};
            swap (arr,0,1);
            System.out.println(Arrays.toString(arr));

        }
        public static void swap(int[] array , int index1 , int index2){
            int temp = array[index1];
            array[index1] = array[index2]; 
            array[index2] = temp;
        }
    }