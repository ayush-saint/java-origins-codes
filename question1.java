import java.util.Scanner;
public class question1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = scanner.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);
    }
    static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        int c =2 ;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(n<c*c){
            return true;
        }
        return false;
    }
}