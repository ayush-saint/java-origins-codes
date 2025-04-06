import java.util.ArrayList;
public class MultidimentionalArraylist{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> multidimen = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(2);
        row1.add(33);
        row1.add(33);
        multidimen.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(33);
        row2.add(55);
        row2.add(88);
        multidimen.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(33);
        row3.add(66);
        row3.add(77);
        multidimen.add(row3);

        System.out.println(multidimen);



    }
}
