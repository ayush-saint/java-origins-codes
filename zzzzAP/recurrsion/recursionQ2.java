//print number 1 to 5 by recursion

public class recursionQ2{
    public static void printnumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumber(n+1);
    }
    public static void main(String[] args){
        int n = 1; 
        printnumber(n);
    }
}