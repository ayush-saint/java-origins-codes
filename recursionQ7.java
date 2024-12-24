//print x^n where (the stack height is n) using recursion where n is 5 and x is 2

public class recursionQ7{
    public static void main(String[] args){
        int x = 2;
        int n = 5;
        int ans = xpower(x,n);
        System.out.println(ans);
        
    }

    public static int xpower(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpowe= xpower(x,n-1);
        int xpow = x*xpowe;
        return xpow;

    }
}