//String topic comapre (.compareTo();) to comparing for String

import java.util.Scanner;

public class Stringtopic_compare{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Strings for comparing");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        /*
        name1>name2 : +ive
        naem1==name2 : 0
        name1<name2 : -ive
        */

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}