import java.util.ArrayList;
public class multidimentionalarraylistoperations{
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> operations = new ArrayList<>();

        ArrayList<Integer > row1= new ArrayList<>();
        row1.add(33);
        row1.add(334);
        row1.add(770);
        operations.add(row1);
        
        ArrayList<Integer > row2 = new ArrayList<>();
        row2.add(44);
        row2.add(55);
        row2.add(88);
        operations.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(3444);
        row3.add(888);
        row3.add(66666);
        operations.add(row3);

        for(ArrayList<Integer> oper : operations){
            System.out.println(oper);
        }

        //get operation 
        System.out.println(operations.get(1));
        System.out.println(operations.get(1).get(2));

        //set operation
        operations.get(2).set(1,22);
        System.out.println(operations.get(2));
        }

        
}
