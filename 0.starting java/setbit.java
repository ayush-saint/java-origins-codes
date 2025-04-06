// set the 2nd bit (pos =1 ) of the number n=0101(5 in decimal number) and print the new number 
public class setbit{
    public static void main(String[] args){
        int n=5;
        int pos=1;
        int bitmask = 1<<pos;
        int newnumber = bitmask | n;
        System.out.println(newnumber);

    }
}