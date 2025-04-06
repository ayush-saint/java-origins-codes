//code to find the bit (0 or 1) using [git bit masking] of the binary representation of a given decimal number at a specific position: position 3, number 5

import java.util.*;

public class getbit{
    public static void main(String[] args){
        int n =5;
        int pos = 3;
        int git = 1<<pos;
        if((n & git) == 0){
            System.out.println("the bit is zero ");
        }else{
            System.out.println("the number is 1");
        }
    }

}