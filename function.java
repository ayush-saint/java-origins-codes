//program using function and the return value is String and it is passed in the function call
public class function{
    public static void main(String[] args){
        String ans = greet("ayush ");
        System.out.println(ans);
    }
    static String greet(String name){
        String nname = "hello" + name;
        return nname;
    }
}