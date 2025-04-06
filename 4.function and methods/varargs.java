import java.util.Arrays;
public class varargs{
    public static void main(String[] args){
        var(2, 3, 34, 4, 33, 44);

    }
    static void var(int ...v){
        System.out.println(Arrays.toString(v));
    }
}