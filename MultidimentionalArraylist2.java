import java.util.Scanner;
import java.util.ArrayList;

public class MultidimentionalArraylist2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multidimen = new ArrayList<>();

        System.out.println("enter the row ");
        int row = scanner.nextInt();
        System.out.println("enter the coulumn ");
        int column = scanner.nextInt();

        for(int i = 0 ; i<row ; i++){
            ArrayList <Integer> row1 = new ArrayList<>();
            System.out.println("enter the elements of Arraylist");
            for(int j =0 ; j<column ; j++){
                row1.add(scanner.nextInt());
            }
            multidimen.add(row1);
        }
        
        for (ArrayList<Integer> dash : multidimen ){
            System.out.println(dash);
        }


    }
}