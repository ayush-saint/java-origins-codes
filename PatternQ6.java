/*        Print Pattern
1
12
123
1234
12345    (half pyramid of numbers)  */
public class PatternQ6{
    public static void main(String[] args){
        for(int i = 2 ; i<=6 ; i++){
            for(int j =1 ; j<=5 ; j++){
                if(j>=i){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}