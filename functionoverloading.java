public class functionoverloading{
    public static void main(String[] args){
        int ans =fun(88,33);
        System.out.println(ans);

    }
    static int fun(int a, int b){
        return a*b;
    }
    static int fun(int a, int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
}