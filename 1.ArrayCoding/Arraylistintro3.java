//operations on arraylist 

import java.util.*;
public class Arraylistintro3{
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();

        // add - adds Integer for Integer and Strings for Strings and other 
        number.add(122);
        number.add(344);
        number.add(555);
        number.add(333);
        number.add(777);
        System.out.println(number);

        // get - printing the number at the given index 
        int a = number.get(0);
        System.out.println(a);

        // set - set the number from the previous to the new one 
        number.set(1,222);
        System.out.println(number.get(1));
        System.out.println(number);

        // size - gaves the size of the arraylist
        int b = number.size();
        System.out.println(b);

        // isEmpty - gaves the index is empty or not 
        boolean c = number.isEmpty();
        System.out.println(c);

        // contains - cheak if the number is contains or not 
        boolean d = number.contains(222);
        System.out.println(d);

        // clear - clear the number of arraylist  
        number.clear();
        System.out.println(number);


    }
}