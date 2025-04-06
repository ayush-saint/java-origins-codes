    //search the minimum number in the array 

    import java.util.Scanner;
    import java.util.Arrays;

    public class linearsearchQ4{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter the size of the array :");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("entert he elements of array of size "+size);

            for(int i = 0 ;i<size ;i++){
                array[i] = scanner.nextInt();
            }

            System.out.println("the array is :");
            for(int nums : array){
                System.out.print(nums+" ");
            }
            System.out.println();

            
            int min = linearsearch(array);
            System.out.println(min);

            scanner.close();
        }
        public static int linearsearch(int[] array){
            int number = array[0];
            for(int i = 0 ; i<array.length ; i++){
                if(array[i]<number){
                    number=array[i];
                }
            }
            return number;
        }
    }