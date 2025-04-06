//clear(makes the number 0) the third bit (pos=2) of a number (n=0101)(5 in decimal number system )

public class clearbit{
    public static void main(String[] args){
        int n = 5; 
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);
        int newnumber = notbitmask & n;
        System.out.println(newnumber);
    }
}