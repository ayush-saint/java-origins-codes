//print x^n where the (stack height = logn)

import java.util.*;

public class recursionQ8{
    public static void main(String[] args){
        int x=2,n=5;
        int ans  = calcpower (x,n);
        System.out.print(ans);
    }
    public static int calcpower(int x,int n ){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcpower(x,n/2)*calcpower(x,n/2);
        }
        else{
            return calcpower(x,n/2)*calcpower(x,n/2)*x;
        }
    }
}