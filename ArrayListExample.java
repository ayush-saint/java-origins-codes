//example of arrarlist

import java.util.ArrayList;

public class ArrayListExample { 
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("apple");
        list.add("banana");
        list.add("guava");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " "); 
        }

        // you cxan also use this enhanced loop instead of for loop 
        
        /* 
         for (String element : list) {
            System.out.println(element);
        }
         */

    }
}