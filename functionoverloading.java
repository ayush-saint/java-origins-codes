public class functionoverloading{
    public static void main(String[] args){
        fun(88);

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }
}